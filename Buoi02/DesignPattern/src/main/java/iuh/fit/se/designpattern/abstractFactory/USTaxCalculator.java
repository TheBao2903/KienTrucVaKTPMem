package iuh.fit.se.designpattern.abstractFactory;

public class USTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(int amount) {
        return amount * 0.07; // Sales tax US ~7%
    }
}
