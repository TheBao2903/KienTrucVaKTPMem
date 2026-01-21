package iuh.fit.se.statepattern;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new NewOrderState(); // trạng thái ban đầu
    }

    public void setState(OrderState state) {
        System.out.println("Change state to: " + state.getStateName());
        this.state = state;
    }

    public void pay() {
        state.pay(this);
    }

    public void ship() {
        state.ship(this);
    }

    public void cancel() {
        state.cancel(this);
    }

    public String getCurrentState() {
        return state.getStateName();
    }
}
