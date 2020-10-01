package Factory.Example_1_Simple_Factory_Pizza_Store;

public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Grated parmesan cheese");
        toppings.add("Fresh White Clams");
    }

}