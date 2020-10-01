package Decorator.Example_2_PizzaCustomize;

public class FiestaPepperoni extends Pizza {

    public FiestaPepperoni() {
        description = "Fiesta Peperoni Pizza";
    }

    @Override
    public double cost() {
        return 27.9;
    }

}