package Decorator.Example_2_PizzaCustomize;

public class Hawaina extends Pizza {

    public Hawaina() {
        description = "Hawaina Pizza";
    }

    @Override
    public double cost() {
        return 28.9;
    }

}