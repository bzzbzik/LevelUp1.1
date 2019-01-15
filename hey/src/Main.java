import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Double.sum;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;
        System.out.println("Please enter first number:");
        Double Num1 = input.nextDouble();
        System.out.println("Please enter second number");
        Double Num2 = input.nextDouble();
        System.out.println("Please choose an action: +, -. *, /");

        String action = input.next();
        switch (action) {
            case "+":
                result = sum(Num1, Num2);
                break;
            case "-":
                result = sub(Num1, Num2);
                break;
            case "*":
                result = mult(Num1, Num2);
                break;
            case "/":
                result = div(Num1, Num2);
                break;
            default:
                System.out.println("Incorrect action");
        }

        System.out.println(Num1 + " " + action + " " + Num2 + " = " + result);
//    double asd = div(4, 8);
//        System.out.println(asd);
    }




    public static double sum ( double a, double b){
        return a + b;

    }
    public static double sub ( double a, double b){
        return a - b;
    }
    public static double mult ( double a, double b){
        return a * b;

    }
    public static double div ( double a, double b){
        if (b == 0) {
            System.out.println("division on zero is not allowed");
            return 0;
        }

        return a / b;


    }
}
