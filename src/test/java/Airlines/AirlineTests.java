package Airlines;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RestUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AirlineTests {

    @Test
    public void createAirline(){

        String baseURI = "https://api.instantwebtools.net/v1/airlines";

//        String reqPayload = Payloads.getCreateAirlinePayloadFromString("88a46ba0-7030-40a9-b0a0-3edd6aa11bb2","ABC Ailines","India",
//                "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/ABC_Airways_Logo.svg/india.png",
//                "From India","Mumbai, India","www.abcairways.com","1980");

        Map<String, Object> reqPayload = Payloads.getCreateAirlinePayloadFromMap("88a46ba0-7030-40a9-b0a0-3edd6aa13579","ABC Ailines","India",
                "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/ABC_Airways_Logo.svg/india.png",
                "From India","Mumbai, India","www.abcairways.com","1980");

        Response response = RestUtils.performPost(baseURI,reqPayload, new HashMap<>());
        Assert.assertEquals(response.statusCode(), 200);

    }
}
