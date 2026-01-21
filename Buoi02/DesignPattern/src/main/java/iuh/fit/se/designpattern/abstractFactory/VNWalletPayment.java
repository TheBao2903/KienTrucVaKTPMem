package iuh.fit.se.designpattern.abstractFactory;

import iuh.fit.se.designpattern.methodFactory.Payment;

public class VNWalletPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("VN Wallet pay: " + amount);
    }
}
