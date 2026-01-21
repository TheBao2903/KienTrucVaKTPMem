package iuh.fit.se.statepattern;

public class ShippedOrderState implements OrderState {

    @Override
    public void pay(OrderContext order) {
        System.out.println("Order already shipped. Cannot pay.");
    }

    @Override
    public void ship(OrderContext order) {
        System.out.println("Order already shipped.");
    }

    @Override
    public void cancel(OrderContext order) {
        System.out.println("Cannot cancel. Order already shipped.");
    }

    @Override
    public String getStateName() {
        return "SHIPPED";
    }
}
