import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import entities.Example;
import entities.Fact;
import entities.FactList;
import entities.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class Deserializing {

    @Test()
    public void deserialize() throws JsonProcessingException {
        Fact fact =
                given().
                        when().
                        get("https://cat-fact.herokuapp.com/facts/").
                        as(Fact.class);
        Assert.assertEquals(
                "Kasimir Schulz",
        fact.getFactList().get(0).getUser().getName().toString()
        );
        Map<User, Long> factsByUser = fact.getFactList().stream().collect(Collectors.groupingBy(Fact::getUser, Collectors.counting()));

        for(Map.Entry<User, Long> item : factsByUser.entrySet()) {
            System.out.println(item.getKey().toString() + " - " + item.getValue());
        }
    }
}
