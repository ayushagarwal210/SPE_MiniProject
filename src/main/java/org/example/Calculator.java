package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Calculator scientificCalculatorObj = new Calculator();
            while(true) {
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
            }
        }
        public double squareRoot(int number) {
            double result = Math.sqrt(number);
            return result;
        }
        public double power(int a,int b) {
            double result = Math.pow(a,b);
            return result;
        }
        public double log(int number) {
            double result = Math.log(number);
            return result;
        }
        public int factorial(int number) {
            int result =1,i;
            for(i=2;i<=number;i++) {
                result*=i;
            }

            return result;
        }
    }
