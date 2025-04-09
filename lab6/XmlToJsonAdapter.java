package lab6;
import org.json.JSONObject;
import org.json.XML;

public class XmlToJsonAdapter implements IDataAnalyzer{

    private JSONAnalyzer jsonAnalyzer;

    public XmlToJsonAdapter() {
        this.jsonAnalyzer = new JSONAnalyzer();
    }

    @Override
    public void analyzeData(String xmlData) {
        System.out.println("converting");
        try{
            JSONObject jsonObject = XML.toJSONObject(xmlData);
            String jsonData = jsonObject.toString();
            jsonAnalyzer.analyzeJSON(jsonData);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
