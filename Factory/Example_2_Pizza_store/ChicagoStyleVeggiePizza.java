package Factory.Example_2_Pizza_store;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Red Peppers");
        toppings.add("Baby Spinach");
        toppings.add("Milk Ricotta Cheese ");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
