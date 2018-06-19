import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int n5000 = n / 5000;
        System.out.println("5000 - " + n5000);
        n = n % 5000;

        int n1000 = n / 1000;
        System.out.println("1000 - " + n1000);
        n = n % 1000;

        int n500 = n / 500;
        System.out.println("500 - " + n500);
        n = n % 500;

        int n100 = n / 100;
        System.out.println("100 - " + n100);
        n = n % 100;

        int n50 = n / 50;
        System.out.println("50 - " + n50);
        n = n % 50;

        int n10 = n / 10;
        System.out.println("10 - " + n10);
        n = n % 10;

        int n5 = n / 5;
        System.out.println("5 - " + n5);
        n = n % 5;

        int n2 = n / 2;
        System.out.println("2 - " + n2);
        n = n % 2;

        int n1 = n / 1;
        System.out.println("1 - " + n1);
        n = n % 1;
    }
}