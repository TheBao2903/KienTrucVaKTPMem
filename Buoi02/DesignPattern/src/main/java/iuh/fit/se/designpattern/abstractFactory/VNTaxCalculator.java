package iuh.fit.se.designpattern.abstractFactory;

import iuh.fit.se.designpattern.methodFactory.Payment;

public class VNTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(int amount) {
        return amount * 0.1; // VAT 10% ở VN
    }
}
