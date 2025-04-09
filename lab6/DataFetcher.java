package lab6;

public class DataFetcher {
    public String fetchData(String source, String format){
        System.out.println("fetching data");
        if(format.equalsIgnoreCase("xml")){
            return "<stock><name>Product</name><price>2000</price></stock>";
        } else {
            return "{\"name\":\"Product\",\"price\":2000}";
        }
    }
}
