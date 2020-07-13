import entities.All;
import entities.Example;
import entities.Name;
import entities.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class Deserializing {

    @Test()
    public void deserialize() {
        Example example =
                given().
                        when().
                        get("https://cat-fact.herokuapp.com/facts/").
                        as(Example.class);
        Assert.assertEquals(
                "Kasimir Schulz",
        example.getAll().get(0).getUser().getName().toString()
        );
        Stream<Example> factStream = Stream.of(example);
        Map<User, Long> factsByUser = factStream.collect(Collectors.groupingBy(User::getName, Collectors.counting()));
    }
}
