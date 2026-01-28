package iuh.fit.se.bai02_observerdesignpattern.BaiToanCoPhieu;

public class Client {
    public static void main(String[] args) {

        Stock apple = new Stock("AAPL", 150);

        Investor a = new Investor("Alice");
        Investor b = new Investor("Bob");

        apple.attach(a);
        apple.attach(b);

        apple.setPrice(155);
    }
}
