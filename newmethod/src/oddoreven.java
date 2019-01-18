import java.util.Scanner;

public class oddoreven {

    public static void main(String args[]) {
        int x;
        System.out.println("Enter a number to check if it is odd or even");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        if (x % 2 == 0)
            System.out.println("The number is even.");

        else
            System.out.println("The number is odd");

    }
}

