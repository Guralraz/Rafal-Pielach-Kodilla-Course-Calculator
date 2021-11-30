package com.kodilla.kodillacoursecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public double addAToB(double a, double b) {
        return a + b;
    }

    public double subtractAFromB(double a, double b) {
        return b - a;
    }

    public static void main(String[] args) {

        SpringApplication.run(CalculatorApplication.class, args);

        CalculatorApplication calculator = new CalculatorApplication();

        System.out.println(calculator.addAToB(551.2, 372.1));
        System.out.println(calculator.subtractAFromB(789.3,54.2));

    }

}
