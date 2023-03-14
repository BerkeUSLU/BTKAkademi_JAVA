import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 6 --> 1,2,3
        // A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
        System.out.print("Please enter a number to see if it is perfect number or not : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }

        if (total == number) {
            System.out.println(number + " is a perfect number because " + total + " is equal to " + number);
        }
        else {
            System.out.println(number + " is not a perfect number because " + total + " is not equal to " + number);
        }
    }
}