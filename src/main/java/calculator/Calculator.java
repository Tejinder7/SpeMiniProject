package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        Scanner scanner= new Scanner(System.in);

        int choice;

        while(true){
            System.out.println("Mini Project - Scientific Calculator with DevOps");
            System.out.println("Choose Operation");

            System.out.println("1. Square root √x\n2. Factorial x!\n3. Natural Logarithm (base e) ln(x)\n4. Power x^b\n5. Exit\n");

            choice= scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println();
                    System.out.println("Calculate Square Root");
                    System.out.println("Enter the number:");
                    double num1= scanner.nextDouble();

                    System.out.println("Result: "+ calculator.squareRoot(num1));
                    System.out.println();

                default:
                    System.out.println("Exiting program");
                    return;
            }
        }

    }

    public double squareRoot(double num1){
        double result= Math.sqrt(num1);
        return result;
    }
}
