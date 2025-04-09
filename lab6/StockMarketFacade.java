package lab6;

public class StockMarketFacade {
    private DataFetcher dataFetcher;
    private IDataAnalyzer iDataAnalyzer;
    private DataVisualizer dataVisualizer;

    public StockMarketFacade() {
        this.dataFetcher = new DataFetcher();
        this.dataVisualizer = new DataVisualizer();
    }

    public void analyzeAndDisplay(String source, String format){
        String data = dataFetcher.fetchData(source, format);

        if(format.equalsIgnoreCase("xml")){
            this.iDataAnalyzer = new XmlToJsonAdapter();
        } else {
            this.iDataAnalyzer = new JsonDirectAdapter();
        }

        iDataAnalyzer.analyzeData(data);
        dataVisualizer.displayResults(data);
    }
}
