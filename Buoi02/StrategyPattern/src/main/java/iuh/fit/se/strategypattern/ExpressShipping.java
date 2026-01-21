package iuh.fit.se.strategypattern;

public class ExpressShipping implements ShippingStrategy {

    @Override
    public double calculateFee(double weightKg, double distanceKm) {
        return weightKg * 8 + distanceKm * 3 + 20;
    }

    @Override
    public String getName() {
        return "EXPRESS";
    }
}
