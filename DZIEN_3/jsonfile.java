import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        JSONObject jo = new JSONObject();

        jo.put("firstName","John");
        jo.put("lastName","Smith");
        jo.put("age",27);

        Map m = new LinkedHashMap(4);
        m.put("streetAddress","21 Street");
        m.put("city","New York");
        m.put("state","NY");
        m.put("postalCode",10021);

        jo.put("address",m);

        JSONArray ja = new JSONArray();
        m = new LinkedHashMap(2);
        m.put("type","home");
        m.put("number","212 555-12345");
        ja.add(m);

        m = new LinkedHashMap(2);
        m.put("type","fax");
        m.put("number","212 555-12788");
        ja.add(m);

        jo.put("phoneNumbers",ja);
        String sttw = "pierwsza liniaa";
        PrintWriter prw = new PrintWriter("Mdane.json");
        prw.write(sttw.toString());
        System.out.println(jo);
    }
}
