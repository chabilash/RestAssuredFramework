package Airlines;

import java.util.HashMap;
import java.util.Map;

public class Payloads {

    public static String getCreateAirlinePayloadFromString(String _id,String name,String country,String logo,
                                                 String slogan,String head_quaters,String website,String established){

        String payload = "{\n" +
                "    \"_id\":\""+_id+"\",\n" +
                "    \"name\": \""+name+"\",\n" +
                "    \"country\": \""+country+"\",\n" +
                "    \"logo\": \""+logo+"\",\n" +
                "    \"slogan\": \""+slogan+"\",\n" +
                "    \"head_quaters\": \""+head_quaters+"\",\n" +
                "    \"website\": \""+website+"\",\n" +
                "    \"established\": \""+established+"\"\n" +
                "}";
        return payload;
    }

    public static Map<String, Object>  getCreateAirlinePayloadFromMap(String _id, String name, String country, String logo,
                                                                     String slogan, String head_quaters, String website, String established){

        Map<String,Object> payload = new HashMap<>();
        payload.put("_id", _id);
        payload.put("name", name);
        payload.put("country", country);
        payload.put("logo", logo);
        payload.put("slogan", slogan);
        payload.put("head_quaters", head_quaters);
        payload.put("website", website);
        payload.put("established", established);

        return payload;
    }
}
