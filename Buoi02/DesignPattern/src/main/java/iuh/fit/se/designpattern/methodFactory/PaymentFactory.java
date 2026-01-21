package iuh.fit.se.designpattern.methodFactory;

public class PaymentFactory {

    // Factory Method
    public static Payment createPayment(String type) {

        if (type.equalsIgnoreCase("CASH")) {
            return new CashPayment();
        }

        if (type.equalsIgnoreCase("WALLET")) {
            return new WalletPayment();
        }

        throw new IllegalArgumentException("Unknown payment type: " + type);
    }
}