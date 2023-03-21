package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public double squareRoot(double num){
        logger.info("[SQUARE ROOT] - " + num);
        double result= Math.sqrt(num);
        logger.info("[SQUARE ROOT- RESULT] - " + result);
        return result;
    }

    public int factorial(int num){
        logger.info("[FACTORIAL] - "+ num);
        int result= 1;

        if(num< 0){
            for(int i= num; i<0; i++){
                result*= i;
            }
        }
        else{
            for(int i= 2; i<= num; i++){
                result*= i;
            }
        }

        logger.info("[FACTORIAL - RESULT] - "+ result);
        return result;
    }

    public double naturalLog(double num){
        logger.info("[NATURAL LOGARITHM] - " + num);
        double result= Math.log(num);
        logger.info("[NATURAL LOGARITHM- RESULT] - " + result);
        return result;
    }

    public double power(double num1, double num2){
        logger.info("[POWER FUNCTION] - " + num1 +"RAISED TO THE POWER "+ num2);
        double result= Math.pow(num1, num2);
        logger.info("[POWER FUNCTION- RESULT] - " + result);
        return result;
    }
}
