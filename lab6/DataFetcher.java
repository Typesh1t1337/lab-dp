package lab6;

public class DataFetcher {
    public String fetchData(String source, String format){
        System.out.println("fetching data");
        if(format.equalsIgnoreCase("xml")){
            return "<"+ source + "><name>Product</name><price>2000</price></" + source + ">";
        } else {
            return "\n{\n"+ source + ":\n{\"name\":\"Product\",\"price\":2000}\n}";
        }
    }
}
