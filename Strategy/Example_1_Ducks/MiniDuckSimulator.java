package Strategy.Example_1_Ducks;

import Strategy.Example_1_Ducks.models.*;
import Strategy.Example_1_Ducks.strategies.Fly.*;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowerd());
        model.performFly();
    }
}