package Decorator.Example_2_PizzaCustomize;

public class Beacon extends IngredientDecorator {

    Pizza pizza;

    public Beacon(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Beacon";
    }

    @Override
    public double cost() {
        return pizza.cost() + .35;
    }

}