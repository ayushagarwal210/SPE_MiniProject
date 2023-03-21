package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator scientificCalculatorObj = new Calculator();
        do {
            System.out.println("Please Enter the operation that you want to perform:-  \n Press 1 to find square root \n Press 2 to find the factorial \n Press 3 to find the log \n Press 4 to find the power \n Press else to exit");
            int option = sc.nextInt();
            if (option == 1) {
                System.out.println("Enter number to calculate square root");
                int number = sc.nextInt();
                double ans = scientificCalculatorObj.squareRoot(number);
                System.out.println("The square root of " + number + " is:- " + ans);
            } else if (option == 2) {
                System.out.println("Enter number to calculate factorial");
                int number = sc.nextInt();
                int ans = scientificCalculatorObj.factorial(number);
                System.out.println("The factorial  of " + number + " is:- " + ans);
            } else if (option == 3) {
                System.out.println("Enter number to calculate log");
                int number = sc.nextInt();
                double ans = scientificCalculatorObj.log(number);
                System.out.println("The log  of " + number + " is:- " + ans);
            } else if (option == 4) {
                System.out.println("Enter two number x and y to calculate x power y");
                int number1 = sc.nextInt();
                int number2 = sc.nextInt();
                double ans = scientificCalculatorObj.power(number1, number2);
                System.out.println(number1 + " power " + number2 + " is:- " + ans);
            } else {
                System.out.println("Goodbye!!");
                break;
            }
        } while(true);
    }
    public double squareRoot(int number) {
        logger.info("[SQ ROOT] - " + number);
        double result =0;
        try {
            if(number<0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of Nan 0.0/0.0");
            }
            else {
                result = Math.sqrt(number);
            }
        }
        catch (ArithmeticException exception) {
            System.out.println("[EXCEPTION - LOG] - Cannot find square root of negative numbers " + exception.getLocalizedMessage());
        }

        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }
    public double power(int a,int b) {
        logger.info("[POWER of  " + a + " TO THE ] " + b);
        double result = Math.pow(a,b);
        logger.info("[RESULT  POWER]  " + result);
        return result;
    }
    public double log(int number) {
        logger.info("[NATURAL LOG] - " + number);
        double result =0;
        try{
            if(number<0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of Nan 0.0/0.0");
            }
            else {
                result = Math.log(number);
            }
        }
        catch (ArithmeticException exception) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + exception.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
    public int factorial(int number) {
        logger.info("Factorial =  " + number);
        int result =1,i;
        for(i=2;i<=number;i++) {
            result*=i;
        }
        logger.info("RESULT - FACTORIAL = " + result);
        return result;
    }
}