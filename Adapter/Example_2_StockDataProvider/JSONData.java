package Adapter.Example_2_StockDataProvider;

public class JSONData implements IData {

    private String data = "I'm JSON data format";

    @Override
    public void stockData() {
        System.out.println("Return Stock: " + data);
    }

    public String getData() {
        return data;
    }

}
