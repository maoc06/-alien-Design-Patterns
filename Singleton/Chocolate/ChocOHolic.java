package Singleton.Chocolate;

public class ChocOHolic {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();

        boiler.fill();
        boiler.boil();
        boiler.drain();

        // will return the same instance of boiler
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

        if (boiler.equals(boiler2)) {
            System.out.println("Are the same instance");
        }
    }
}