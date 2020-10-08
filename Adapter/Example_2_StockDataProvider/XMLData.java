package Adapter.Example_2_StockDataProvider;

public class XMLData implements IData {

    private String data = "I'm XML data format";

    @Override
    public void stockData() {
        System.out.println("Return Stock: " + data);
    }

    public String getData() {
        return data;
    }

}
