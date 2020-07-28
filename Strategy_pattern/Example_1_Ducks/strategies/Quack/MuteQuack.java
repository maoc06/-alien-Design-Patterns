package Strategy_pattern.Example_1_Ducks.strategies.Quack;

public class MuteQuack implements QuackBehaviorStartegy {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}