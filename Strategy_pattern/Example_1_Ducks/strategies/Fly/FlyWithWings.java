package Strategy_pattern.Example_1_Ducks.strategies.Fly;

public class FlyWithWings implements FlyBehaviorStrategy {

    public void fly() {
        System.out.println("I'm flying!");
    }

}