package iuh.fit.se.strategypattern;

public class Order {

    private ShippingStrategy shippingStrategy;

    public Order(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        System.out.println("Change shipping strategy to: " + shippingStrategy.getName());
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShippingFee(double weightKg, double distanceKm) {
        return shippingStrategy.calculateFee(weightKg, distanceKm);
    }
}
