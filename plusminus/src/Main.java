import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String x;
        char action;
        System.out.println("Please enter on of this characters +,-,*,/");

        Scanner input = new Scanner(System.in);
        switch (action = input.next().charAt(0)) {
        }
        switch (action) {
            case '+':
                System.out.println("Plus");
                break;
            case '-':
                System.out.println("Minus");
                break;
            case '*':
                System.out.println("Mult_sign");
                break;
            case '/':
                System.out.println("Div_sign");
                break;
        }
    }
}
