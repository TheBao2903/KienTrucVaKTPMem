package iuh.fit.se.statepattern;

public interface OrderState {
    void pay(OrderContext order);
    void ship(OrderContext order);
    void cancel(OrderContext order);
    String getStateName();
}
