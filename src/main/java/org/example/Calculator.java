package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    private static final Logger LOGGER = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        int result = a + b;
        LOGGER.info("In add() method: a={}, b={}, result={}", a, b, result);



        int d;
        return           result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            LOGGER.error("a={}, b={}", a, b);
            throw new IllegalArgumentException("Division by zero");
        }
        int result = a / b;
        LOGGER.info("In divide() method: a={}, b={}, result={}", a, b, result);
        return result;
    }
}