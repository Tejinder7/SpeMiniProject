package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        Scanner scanner= new Scanner(System.in);

        int choice;

        while(true){
            System.out.println("Mini Project - Scientific Calculator with DevOps");
            System.out.println("Choose Operation");

            System.out.println("1. Square root √x\n2. Factorial x!\n3. Natural Logarithm (base e) ln(x)\n4. Power x^b\n5. Exit\n");

            try{
                choice= scanner.nextInt();
            }
            catch(InputMismatchException exception){
                System.out.println(exception);
                System.out.println("Wrong input type. Exiting Application");
                return;
            }

            switch (choice){
                case 1:
                    System.out.println();
                    System.out.println("Calculate Square Root");
                    System.out.println("Enter the number:");
                    double num1= scanner.nextDouble();

                    System.out.println("Result: "+ calculator.squareRoot(num1));
                    System.out.println();
                    break;

                default:
                    System.out.println("Exiting program");
                    return;
            }
        }
    }

    public double squareRoot(double num1){
        logger.info("[SQUARE ROOT] - " + num1);
        double result= Math.sqrt(num1);
        logger.info("[SQUARE ROOT- RESULT] - " + result);
        return result;
    }
}
