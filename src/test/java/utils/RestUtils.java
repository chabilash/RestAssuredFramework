package utils;

import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestUtils {

    public static Response performPost(String baseURI, String reqPayload, Map<String,String> headers) {

        return RestAssured.given().log().all()
                .baseUri(baseURI)
                .contentType(ContentType.JSON)
                .body(reqPayload)
                .post()
                .then().log().all()
                .extract().response();
    }

}
