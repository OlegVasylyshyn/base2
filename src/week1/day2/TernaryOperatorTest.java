package week1.day2;

import java.util.Scanner;

public class TernaryOperatorTest {

    public static void main(String[] args) {

        // condition ? true : false ;
        System.out.print("Enter your age - ");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();

        System.out.println((userAge < 0) ? "Error" : "Correct");
    }

}
