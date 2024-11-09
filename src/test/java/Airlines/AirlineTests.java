package Airlines;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AirlineTests {

    @Test
    public void createAirline(){

        Response response = RestAssured.given().log().all()
                .baseUri("https://api.instantwebtools.net/v1/airlines")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"_id\":\"252d3bca-d9bb-c3d4-a1b2-562d685e987d\",\n" +
                        "    \"name\": \"TATA Airways\",\n" +
                        "    \"country\": \"India\",\n" +
                        "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                        "    \"slogan\": \"From India\",\n" +
                        "    \"head_quaters\": \"Mumbai, India\",\n" +
                        "    \"website\": \"www.tataairways.com\",\n" +
                        "    \"established\": \"1975\"\n" +
                        "}")
                .post()
                .then().log().all()
                .extract().response();
        Assert.assertEquals(response.statusCode(), 200);

    }
}
