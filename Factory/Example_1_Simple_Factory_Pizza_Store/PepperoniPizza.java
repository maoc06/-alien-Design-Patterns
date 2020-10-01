package Factory.Example_1_Simple_Factory_Pizza_Store;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Grated parmesan cheese");
        toppings.add("Sliced Pepperoni");
    }
}
