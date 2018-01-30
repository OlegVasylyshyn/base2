package week7.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunTimeExceptions {

    public static void main(String[] args) {

        while (true) {
            try {
                m();
            } catch (InputMismatchException e) {
                System.out.println("Enter only numbers");
                continue;
            }
            break;
        }

        throw new RuntimeException("runtime exception");


    }

    private static void m(){
        Scanner scanner = new Scanner(System.in);

        scanner.nextInt();


    }

}
