package Airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restUtils.RestUtils;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlineTests {

    @Test
    public void createAirline() throws IOException {
        String env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
        Map<String, Object> data = JsonUtils.getJsonDataAsMap("airlines/qa/airlinesApiData.json");

        String baseURI = (String) data.get("createAirlineEndPoint");

//        String reqPayload = Payloads.getCreateAirlinePayloadFromString("88a46ba0-7030-40a9-b0a0-3edd6aa11bb2","ABC Ailines","India",
//                "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/ABC_Airways_Logo.svg/india.png",
//                "From India","Mumbai, India","www.abcairways.com","1980");

        Map<String, Object> reqPayload = Payloads.getCreateAirlinePayloadFromMap("88a46ba0-7030-40a9-b0a0-3edd6aa13231","ABC Ailines","India",
                "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/ABC_Airways_Logo.svg/india.png",
                "From India","Mumbai, India","www.abcairways.com","1980");

        Response response = RestUtils.performPost(baseURI,reqPayload, new HashMap<>());
        Assert.assertEquals(response.statusCode(), 200);

    }
}
