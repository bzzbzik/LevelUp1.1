import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        numerate(100, 1);
        tillten();
    }

    public static void numerate(int max, int step) {
        int i = 0;
        while (i <= max) {
            System.out.println(i);
            i = i + step;
        }
    }


    public static void tillten() {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Input '10' number: ");
        n = input.nextInt();
        while (n != 10) {
            System.out.println("You entered: " + n);
            System.out.println("Please input '10': ");
            n = input.nextInt();

        }
        System.out.println("Thank you!");
    }
}