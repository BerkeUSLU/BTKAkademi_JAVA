import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Lütfen bir sayı giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("");

        int remainder = number % 2;

        //System.out.println(remainder);

        if (number <= 2) {
            System.out.println("Geçersiz bir sayı girişi yaptınız!");
            System.out.print("Program sonlandırıldı!");
            System.exit(1);
        }

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " sayısı asaldır! ");
        }
        else {
            System.out.println(number + " sayısı asal değildir! ");
        }

    }
}