package Decorator_pattern.Example_2_PizzaCustomize;

public abstract class Pizza {

    String description = "Unknown Pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}