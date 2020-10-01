package Decorator.Example_2_PizzaCustomize;

public class Jalapeno extends IngredientDecorator {

    Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Jalapeno";
    }

    @Override
    public double cost() {
        return pizza.cost() + .20;
    }

}