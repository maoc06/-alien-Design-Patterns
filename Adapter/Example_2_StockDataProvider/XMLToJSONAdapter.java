package Adapter.Example_2_StockDataProvider;

public class XMLToJSONAdapter extends XMLData {
    private JSONData jsonData;

    public XMLToJSONAdapter(JSONData jsonData) {
        this.jsonData = jsonData;
    }

    @Override
    public void stockData() {
        System.out.println("Return Stock: " + jsonData.getData() + " convert in XML");
    }
}
