package iuh.fit.se.designpattern.methodFactory;

public class WalletPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Pay " + amount + " by Wallet");
    }
}
