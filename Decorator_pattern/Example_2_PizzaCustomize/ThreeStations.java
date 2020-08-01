package Decorator_pattern.Example_2_PizzaCustomize;

public class ThreeStations extends Pizza {

    public ThreeStations() {
        description = "3 Stations Pizza";
    }

    @Override
    public double cost() {
        return 29.99;
    }

}