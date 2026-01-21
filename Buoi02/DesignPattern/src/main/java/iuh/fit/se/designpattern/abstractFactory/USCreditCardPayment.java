package iuh.fit.se.designpattern.abstractFactory;

import iuh.fit.se.designpattern.methodFactory.Payment;

public class USCreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("US Credit Card pay: " + amount);
    }
}
