package Decorator.Example_2_PizzaCustomize;

public class SuperChicken extends Pizza {

    public SuperChicken() {
        description = "Super Chicken Pizza";
    }

    @Override
    public double cost() {
        return 30.9;
    }

}