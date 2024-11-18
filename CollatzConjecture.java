import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Starting number: " + number);

            while (number != 1) {
                if (number % 2 == 0) {
                    number = number / 2;
                } else {
                    number = number * 3 + 1;
                }
                System.out.println("Next number: " + number);
            }

            System.out.println("Reached 1!");
        } else {
            System.out.println("Invalid number. Please enter a positive integer.");
        }

        input.close();
    }
}
