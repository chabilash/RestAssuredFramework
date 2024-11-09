package Airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restUtils.RestUtils;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlineTests extends AirlineAPIs {

    @Test
    public void createAirline()  {


        Map<String, Object> reqPayload = Payloads.getCreateAirlinePayloadFromMap("16a46ba0-7030-40a9-b0a0-3edd6aa19091","ABC Airlines","India",
                "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/ABC_Airways_Logo.svg/india.png",
                "From India","Mumbai, India","www.abcairways.com","1980");

        Response response = createAirline(reqPayload);
        Assert.assertEquals(response.statusCode(), 200);

    }
}
