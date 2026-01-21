package iuh.fit.se.designpattern.abstractFactory;

import iuh.fit.se.designpattern.methodFactory.Payment;

public class USFactory implements EcommerceFactory {
    @Override
    public Payment createPayment() {
        return new USCreditCardPayment();
    }

    @Override
    public TaxCalculator createTaxCalculator() {
        return new USTaxCalculator();
    }
}
