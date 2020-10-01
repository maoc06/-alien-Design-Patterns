package Strategy.Example_1_Ducks.models;

import Strategy.Example_1_Ducks.strategies.Fly.*;
import Strategy.Example_1_Ducks.strategies.Quack.*;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}