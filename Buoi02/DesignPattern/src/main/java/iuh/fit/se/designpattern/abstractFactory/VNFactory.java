package iuh.fit.se.designpattern.abstractFactory;

import iuh.fit.se.designpattern.methodFactory.Payment;

public class VNFactory implements EcommerceFactory {

    @Override
    public Payment createPayment() {
        return new VNWalletPayment();
    }

    @Override
    public TaxCalculator createTaxCalculator() {
        return new VNTaxCalculator();
    }
}
