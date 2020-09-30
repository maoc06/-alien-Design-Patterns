package Factory_pattern.Example_2_Pizza_store;

public class NYStyleClamPizza extends Pizza {

    NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams");
        toppings.add("Fresh Spinach");
    }
}
