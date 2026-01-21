package iuh.fit.se.designpattern.methodFactory;

public class CashPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Pay " + amount + " by CASH");
    }
}
