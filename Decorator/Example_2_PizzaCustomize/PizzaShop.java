package Decorator.Example_2_PizzaCustomize;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza1 = new FiestaPepperoni();
        System.out.println(pizza1.getDescription() + " $" + pizza1.cost());

        Pizza pizza2 = new Hawaina();
        pizza2 = new Jalapeno(pizza2);
        pizza2 = new Beacon(pizza2);
        System.out.println(pizza2.getDescription() + " $" + pizza2.cost());

        Pizza pizza3 = new SuperChicken();
        pizza3 = new Jalapeno(pizza3);
        pizza3 = new Beacon(pizza3);
        pizza3 = new Tomato(pizza3);
        System.out.println(pizza3.getDescription() + " $" + pizza3.cost());
    }
}