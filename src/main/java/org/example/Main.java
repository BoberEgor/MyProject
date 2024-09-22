package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an arithmetic expression");
        System.out.println("which consists of the two whole numbers from 1 to 10");
        System.out.println("an operator between them: +, -, *, /");
        System.out.println("all separated by spaces.");
        System.out.println();

        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println(input + " = " + result);
    }

    public static String calc(String input) throws Exception {
        String result;
        int res;
        int numberOne;
        int numberTwo;
        String operator;

        if (input.isEmpty()){
            throw new Exception("String is empty");
        }

        String[] str = input.split(" ");

        if(str.length != 3){
            throw new Exception("Invalid length");
        }

        operator = str[1];

        try{
            numberOne = Integer.parseInt(str[0]);
            numberTwo = Integer.parseInt(str[2]);
        }catch (Exception e){
            throw new Exception("number is not Integer");
        }

        if ((numberOne < 1 || numberOne > 10) && (numberTwo < 1 || numberTwo > 10)){
            throw new Exception("numbers are not between 1 and 10");
        }

        switch (operator){
            case "+":
                res = numberOne + numberTwo;
                break;
            case "-":
                res = numberOne - numberTwo;
                break;
            case "*":
                res = numberOne * numberTwo;
                break;
            case "/":
                res = numberOne / numberTwo;
                break;
            default:
                throw new Exception("Invalid is operator");
        }

        result = Integer.toString(res);
        return result;
    }
}