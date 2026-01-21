package iuh.fit.se.designpattern;

import iuh.fit.se.designpattern.abstractFactory.EcommerceFactory;
import iuh.fit.se.designpattern.abstractFactory.TaxCalculator;
import iuh.fit.se.designpattern.abstractFactory.VNFactory;
import iuh.fit.se.designpattern.methodFactory.Payment;
import iuh.fit.se.designpattern.methodFactory.PaymentFactory;
import iuh.fit.se.designpattern.singleTon.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
//        Logger logger1 = Logger.getInstance();
//        Logger logger2 = Logger.getInstance();
//
//        logger1.logInfo("Application started");
//        logger2.logError("Something went wrong");
//
//        // Kiểm tra xem có đúng 1 instance không
//        System.out.println("Logger1 hash: " + System.identityHashCode(logger1));
//        System.out.println("Logger2 hash: " + System.identityHashCode(logger2));

//        Payment payment1 = PaymentFactory.createPayment("CASH");
//        payment1.pay(100_000);
//
//        Payment payment2 = PaymentFactory.createPayment("WALLET");
//        payment2.pay(200_000);

        EcommerceFactory factory = new VNFactory(); // đổi sang USFactory

        Payment payment = factory.createPayment();
        TaxCalculator tax = factory.createTaxCalculator();

        int amount = 100_000;
        double taxAmount = tax.calculateTax(amount);

        payment.pay(amount + (int) taxAmount);
    }
}
