package Airlines;

import Airlines.pojos.Airline;
import utils.DateUtils;
import utils.RandomDataGenerator;
import utils.RandomDataTypeNames;

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

    public static Map<String, Object> getCreateAirlinePayloadFromMap() {
        Map<String, Object> payload = new HashMap<>();
        payload.put("id", RandomDataGenerator.getRandomNumber(10));
        payload.put("name", RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.FIRSTNAME));
        payload.put("country", RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.COUNTRY));
        payload.put("logo", RandomDataGenerator.getRandomAlphabets(25));
        payload.put("slogan", RandomDataGenerator.getRandomAlphabets(20));
        payload.put("head_quaters", RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.CITYNAME));
        payload.put("website", RandomDataGenerator.getRandomWebsiteName());
        payload.put("established", RandomDataGenerator.getRandomNumber(1900, DateUtils.getCurrentYear()));
        return payload;
    }

    public static Airline getCreatePayloadFromPOJO(){
        return Airline
                .builder()
                .id(Integer.parseInt(RandomDataGenerator.getRandomNumber(10)))
                .name(RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.FIRSTNAME))
                .country(RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.COUNTRY))
                .logo(RandomDataGenerator.getRandomAlphabets(25))
                .slogan(RandomDataGenerator.getRandomAlphabets(20))
                .head_quaters(RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.CITYNAME))
                .website(RandomDataGenerator.getRandomWebsiteName())
                .established(String.valueOf(RandomDataGenerator.getRandomNumber(1900, DateUtils.getCurrentYear())))
                .build();

    }
}
