package Strategy_pattern.Example_1_Ducks.models;

import Strategy_pattern.Example_1_Ducks.strategies.Fly.*;
import Strategy_pattern.Example_1_Ducks.strategies.Quack.*;

public abstract class Duck {

    FlyBehaviorStrategy flyBehavior;
    QuackBehaviorStartegy quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swin() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehaviorStrategy fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehaviorStartegy qb) {
        quackBehavior = qb;
    }
}