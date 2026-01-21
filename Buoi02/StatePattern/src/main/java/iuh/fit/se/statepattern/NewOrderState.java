package iuh.fit.se.statepattern;

public class NewOrderState implements OrderState {

    @Override
    public void pay(OrderContext order) {
        System.out.println("Order paid successfully.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void ship(OrderContext order) {
        System.out.println("Cannot ship. Order not paid yet.");
    }

    @Override
    public void cancel(OrderContext order) {
        System.out.println("Order cancelled.");
        order.setState(new CancelledOrderState());
    }

    @Override
    public String getStateName() {
        return "NEW";
    }
}

