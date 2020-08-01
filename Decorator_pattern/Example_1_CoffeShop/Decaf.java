package Decorator_pattern.Example_1_CoffeShop;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffe";
    }

    @Override
    public double cost() {
        return 1.05;
    }

}