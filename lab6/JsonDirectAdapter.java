package lab6;

public class JsonDirectAdapter implements IDataAnalyzer{
    private JSONAnalyzer jsonAnalyzer;

    public JsonDirectAdapter() {
        this.jsonAnalyzer = new JSONAnalyzer();
    }

    @Override
    public void analyzeData(String data) {
        jsonAnalyzer.analyzeJSON(data);
    }
}
