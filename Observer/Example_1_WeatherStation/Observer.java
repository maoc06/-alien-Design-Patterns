package Observer.Example_1_WeatherStation;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}