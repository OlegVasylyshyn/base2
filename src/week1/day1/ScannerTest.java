package week1.day1;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        System.out.print("Enter your number - ");
        Scanner scanner = new Scanner(System.in);
        int numberFromConsole = scanner.nextInt();
        System.out.print("Here your number - ");
        System.out.println(numberFromConsole);


        System.out.print("Enter your double number - ");
        double doubleFromConsole = scanner.nextDouble();
        System.out.print("Here your double number - ");
        System.out.println(doubleFromConsole);
    }

}
