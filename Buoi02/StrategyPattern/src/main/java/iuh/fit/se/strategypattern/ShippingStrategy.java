package iuh.fit.se.strategypattern;

public interface ShippingStrategy {
    double calculateFee(double weightKg, double distanceKm);
    String getName();
}
