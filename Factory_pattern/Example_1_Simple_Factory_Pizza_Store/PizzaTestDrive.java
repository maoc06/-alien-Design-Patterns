package Factory_pattern.Example_1_Simple_Factory_Pizza_Store;

public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + " \n");

        pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + " \n");

        pizza = pizzaStore.orderPizza("clam");
        System.out.println("Uma ordered a " + pizza.getName() + " \n");

        pizza = pizzaStore.orderPizza("veggie");
        System.out.println("Tom ordered a " + pizza.getName() + " \n");
    }
}
