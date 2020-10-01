package Factory.Example_2_Pizza_store;

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Deep Dish Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Freshly-Shucked Clams");
        toppings.add("Drizzled Olive Oil");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
