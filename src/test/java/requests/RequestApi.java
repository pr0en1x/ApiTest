package requests;

import entities.Example;

import static io.restassured.RestAssured.given;

public class RequestApi {
    public RequestApi() {
        given().
                when().
                get("https://cat-fact.herokuapp.com/facts/").
                as(Example .class);
    }
}
