package Strategy.Example_1_Ducks.strategies.Fly;

public class FlyNoWay implements FlyBehaviorStrategy {

    public void fly() {
        System.out.println("I can't fly");
    }

}