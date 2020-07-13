package requests;

import entities.Fact;
import entities.User;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class RequestApi {
    public static User maxEntry() {
        Fact fact =
                given().
                        when().
                        get("https://cat-fact.herokuapp.com/facts/").
                        as(Fact.class);

        Map<User, Long> factsCountByUser = fact.getFactList().
                stream().
                filter(e -> e.getUser() != null).
                collect(Collectors.groupingBy(Fact::getUser, Collectors.counting()));

        return Collections.max(factsCountByUser.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
