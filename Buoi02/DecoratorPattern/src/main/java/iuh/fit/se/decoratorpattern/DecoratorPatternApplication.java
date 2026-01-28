package iuh.fit.se.decoratorpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoratorPatternApplication.class, args);

        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " = " + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new CaramelDecorator(coffee);

        System.out.println(coffee.getDescription() + " = " + coffee.getCost());
    }
}
