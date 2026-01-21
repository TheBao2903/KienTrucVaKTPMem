package iuh.fit.se.designpattern.abstractFactory;

import iuh.fit.se.designpattern.methodFactory.Payment;

public interface EcommerceFactory {
    Payment createPayment();
    TaxCalculator createTaxCalculator();
}
