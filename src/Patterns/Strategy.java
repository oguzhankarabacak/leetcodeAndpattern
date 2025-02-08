package Patterns;


// Strategy interface
interface PaymentStrategy {
    void pay(int amount);
}

// ConcreteStrategyA
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with credit card.");
    }
}

// ConcreteStrategyB
class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with PayPal.");
    }
}

// Context
class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        strategy.pay(amount);
    }
}

public class Strategy {
    public static void main(String[] args) {
        // CreditCardPayment Strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentContext context1 = new PaymentContext(creditCardPayment);
        context1.executePayment(100);  // Çıktı: Paying 100 with credit card.

        // PayPalPayment Strategy
        PaymentStrategy payPalPayment = new PayPalPayment();
        PaymentContext context2 = new PaymentContext(payPalPayment);
        context2.executePayment(50);   // Çıktı: Paying 50 with PayPal.
    }
}