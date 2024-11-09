package Airlines;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RestUtils;

import java.util.HashMap;

public class AirlineTests {

    @Test
    public void createAirline(){

        String baseURI = "https://api.instantwebtools.net/v1/airlines";
        String payload = "{\n" +
                "    \"_id\":\"252d3bca-d9bb-c3d4-a1b2-562d685e1188\",\n" +
                "    \"name\": \"TATA Airways\",\n" +
                "    \"country\": \"India\",\n" +
                "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                "    \"slogan\": \"From India\",\n" +
                "    \"head_quaters\": \"Mumbai, India\",\n" +
                "    \"website\": \"www.tataairways.com\",\n" +
                "    \"established\": \"1975\"\n" +
                "}";

        Response response = RestUtils.performPost(baseURI,payload, new HashMap<>());
        Assert.assertEquals(response.statusCode(), 200);

    }
}
