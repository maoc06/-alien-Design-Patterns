package Factory.Example_1_Simple_Factory_Pizza_Store;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Shredded mozzarella");
        toppings.add("Red Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }

}
