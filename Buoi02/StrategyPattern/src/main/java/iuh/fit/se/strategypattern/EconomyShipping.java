package iuh.fit.se.strategypattern;

public class EconomyShipping implements ShippingStrategy {

    @Override
    public double calculateFee(double weightKg, double distanceKm) {
        return weightKg * 3 + distanceKm * 1.5;
    }

    @Override
    public String getName() {
        return "ECONOMY";
    }
}
