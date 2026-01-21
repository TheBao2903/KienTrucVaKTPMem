package iuh.fit.se.statepattern;

public class PaidOrderState implements OrderState {

    @Override
    public void pay(OrderContext order) {
        System.out.println("Order already paid.");
    }

    @Override
    public void ship(OrderContext order) {
        System.out.println("Order shipped.");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void cancel(OrderContext order) {
        System.out.println("Order cancelled after payment.");
        order.setState(new CancelledOrderState());
    }

    @Override
    public String getStateName() {
        return "PAID";
    }
}

