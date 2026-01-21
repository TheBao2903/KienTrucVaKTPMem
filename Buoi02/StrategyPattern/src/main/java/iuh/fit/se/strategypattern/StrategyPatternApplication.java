package iuh.fit.se.strategypattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategyPatternApplication.class, args);

        Order order = new Order(new StandardShipping());

        double fee1 = order.calculateShippingFee(10, 15);
        System.out.println("Fee (STANDARD): " + fee1);

        order.setShippingStrategy(new ExpressShipping());
        double fee2 = order.calculateShippingFee(10, 15);
        System.out.println("Fee (EXPRESS): " + fee2);

        order.setShippingStrategy(new EconomyShipping());
        double fee3 = order.calculateShippingFee(10, 15);
        System.out.println("Fee (ECONOMY): " + fee3);
    }

}
