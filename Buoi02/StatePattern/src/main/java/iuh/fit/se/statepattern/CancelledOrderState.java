package iuh.fit.se.statepattern;

public class CancelledOrderState implements OrderState {

    @Override
    public void pay(OrderContext order) {
        System.out.println("Cannot pay. Order is cancelled.");
    }

    @Override
    public void ship(OrderContext order) {
        System.out.println("Cannot ship. Order is cancelled.");
    }

    @Override
    public void cancel(OrderContext order) {
        System.out.println("Order already cancelled.");
    }

    @Override
    public String getStateName() {
        return "CANCELLED";
    }
}
