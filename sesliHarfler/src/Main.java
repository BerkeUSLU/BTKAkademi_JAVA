import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Lütfen bir harf giriniz : ");
        Scanner scan = new Scanner(System.in);
        char harf = scan.next().toUpperCase().charAt(0);
        // A I O U
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(harf + " harfi kalın sesli bir harftir!");
                break;
            default:
                System.out.println(harf + " harfi ince sesli bir harftir!");
        }
    }
}