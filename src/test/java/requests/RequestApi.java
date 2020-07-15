package requests;

import entities.Fact;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RequestApi {
    public static List<Fact> facts() {
        return given().
                when().
                get("https://cat-fact.herokuapp.com/facts/").
                jsonPath().
                getList("all", Fact.class);
    }
}