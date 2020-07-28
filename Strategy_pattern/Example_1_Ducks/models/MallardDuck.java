package Strategy_pattern.Example_1_Ducks.models;

import Strategy_pattern.Example_1_Ducks.strategies.Fly.*;
import Strategy_pattern.Example_1_Ducks.strategies.Quack.*;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}