package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public double squareRoot(double num1){
        logger.info("[SQUARE ROOT] - " + num1);
        double result= Math.sqrt(num1);
        logger.info("[SQUARE ROOT- RESULT] - " + result);
        return result;
    }
}
