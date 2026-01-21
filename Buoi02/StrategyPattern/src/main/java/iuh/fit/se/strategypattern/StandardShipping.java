package iuh.fit.se.strategypattern;

public class StandardShipping implements ShippingStrategy {

    @Override
    public double calculateFee(double weightKg, double distanceKm) {
        return weightKg * 5 + distanceKm * 2;
    }

    @Override
    public String getName() {
        return "STANDARD";
    }
}

