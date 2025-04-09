package lab6;

import org.json.JSONObject;

public class JSONAnalyzer {
    public void analyzeJSON(String dataJSON){
        System.out.println("json analyze");
        try{
            JSONObject json = new JSONObject(dataJSON);
            System.out.println(json);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
