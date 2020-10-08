package Adapter.Example_2_StockDataProvider;

public class StockTestDrive {
    public static void main(String[] args) {
        XMLData xmlStockData = new XMLData();

        JSONData jsonStockData = new JSONData();
        XMLData adapter = new XMLToJSONAdapter(jsonStockData);

        testData(xmlStockData);

        testData(adapter);
    }

    static void testData(XMLData xmlData) {
        xmlData.stockData();
    }
}
