package requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestApi {
    public static Response response() {
        return given().
                when().
                get("https://cat-fact.herokuapp.com/facts/");
    }
}