package Decorator_pattern.Example_2_PizzaCustomize;

public class Tomato extends IngredientDecorator {

    Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato";
    }

    @Override
    public double cost() {
        return pizza.cost() + .20;
    }

}