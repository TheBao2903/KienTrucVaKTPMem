package iuh.fit.se.statepattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatePatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(StatePatternApplication.class, args);
        OrderContext order = new OrderContext();

        System.out.println("Current state: " + order.getCurrentState());

        order.ship();
        order.pay();
        order.ship();
        order.cancel();
    }

}
