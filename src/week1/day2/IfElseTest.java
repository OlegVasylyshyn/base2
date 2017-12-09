package week1.day2;

import java.util.Scanner;

public class IfElseTest {

    public static void main(String[] args) {

        int adult = 18;

        System.out.print("Enter your age - ");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();

        if(userAge > adult) {
            System.out.println("You are adult"); // statement
        } else {
            System.out.println("You aren't adult");
        } // statement , expression 10 + 5






    }

}
