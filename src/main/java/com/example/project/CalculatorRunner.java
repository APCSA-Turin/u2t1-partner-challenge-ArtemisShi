package com.example.project;
import java.util.Scanner;
public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //test your program here
        //1. create an instance of the calculator class

 Calculator calc1 = new Calculator("TI84");

        //2. call any methods of that class to test

        System.out.println("I can divide, multiply, subtract, and add anything!");
        System.out.println("Give me an operand");
        String operand = myScanner.nextLine();
        System.out.println("Give me an integer");
        int num1 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Give me another integer");
        int num2 = myScanner.nextInt();
        myScanner.nextLine();
       System.out.println(calc1.performOperation(operand, num1, num2)); 

       System.out.println();
       System.out.println("I will now see if integer 1 is divisible by integer 2");
       System.out.println("Give me an integer");
    num1 = myScanner.nextInt();
    myScanner.nextLine();
    System.out.println("Give me a second integer");
    num2 = myScanner.nextInt();
    myScanner.nextLine();
    System.out.println(calc1.divisibleBy(num1,num2));

    System.out.println();
System.err.println("Now I will make a coordinate pair. Give me an integer");
num1 = myScanner.nextInt();
myScanner.nextLine();
System.out.println("Give me a second integer");
    num2 = myScanner.nextInt();
    myScanner.nextLine();
    System.out.println(calc1.coordinatePair(num1, num2));

    System.out.println();
    System.out.println("Now I will find the absolute value of two integers. Give me an integer");
    num1 = myScanner.nextInt();
myScanner.nextLine();
System.out.println("Give me a second integer");
    num2 = myScanner.nextInt();
    myScanner.nextLine();
    System.out.println(calc1.absoluteValue(num1, num2));

    System.out.println();
    System.out.println(calc1.info());
    }
}
