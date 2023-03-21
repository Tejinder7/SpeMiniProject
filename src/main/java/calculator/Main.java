package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Calculator calculator= new Calculator();

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int choice;
        double num1;
        double num2;
        int factorial;

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
                    System.out.println("Enter the number: ");
                    num1= scanner.nextDouble();

                    System.out.println("Result: "+ calculator.squareRoot(num1));
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Calculate Factorial of an integer");
                    System.out.println("Enter the number: ");

                    try{
                        factorial= scanner.nextInt();
                    }
                    catch(InputMismatchException exception){
                        System.out.println(exception);
                        System.out.println("Try again and enter a natural number");
                        return;
                    }

                    System.out.println("Result: "+ calculator.factorial(factorial));
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Calculate Natural Logarithm");
                    System.out.println("Enter the number: ");
                    num1= scanner.nextDouble();

                    System.out.println("Result: "+ calculator.naturalLog(num1));
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Calculate Power");

                    System.out.println("Enter the base: ");
                    num1= scanner.nextDouble();
                    System.out.println("Enter the exponent: ");
                    num2= scanner.nextDouble();

                    System.out.println("Result: "+ calculator.power(num1, num2));
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting program");
                    return;

                default:
                    System.out.println("Wrong input. Try Again");
                    break;
            }
        }
    }
}
