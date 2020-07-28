package Strategy_pattern.Example_2_PaymentMethods.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}