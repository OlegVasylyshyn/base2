package week1.day2;

import java.util.Scanner;

public class IfElseIfTest {

    public static void main(String[] args) {

        int child = 5;
        int pupil = 16;
        int adult = 18;
        int old = 65;

        System.out.print("Enter your age - ");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();

        // wrong approach
        /*
        if(userAge < child) {
            System.out.println("you are child");
        }
        if(userAge < pupil) {
            System.out.println("you are pupil");
        }
        if(userAge < adult) {
            System.out.println("you are not adult");
        }
        if(userAge > old) {
            System.out.println("you are very old");
        }
        */

        // correct approach
        if(userAge > 0 && userAge <= child) {
            System.out.println("you are child");
        } else if(userAge > child && userAge <= pupil) {
            System.out.println("you are pupil");
        } else if(userAge > adult && userAge <= old) {
            System.out.println("you are not adult");
        } else if(userAge > old && userAge <= 100) {
            System.out.println("you are old");
        } else if(userAge <= 0 || userAge > 100) {
            System.out.println("Error");
        }




    }

}
