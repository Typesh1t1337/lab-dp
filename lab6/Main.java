package lab6;


public class Main {
    public static void main(String[] args) {
        IDataAnalyzer xmlAnalyzer = new XMLAnalyzer();
        IDataAnalyzer adapter = new XmlToJsonAdapter();

        xmlAnalyzer.analyzeData("<stock><price>150</price></stock>");
        adapter.analyzeData("<stock><price>200</price></stock>");
        System.out.println("\n----------");
        StockMarketFacade facade = new StockMarketFacade();
        facade.analyzeAndDisplay("stock", "xml");
        facade.analyzeAndDisplay("name", "json");
    }
}
