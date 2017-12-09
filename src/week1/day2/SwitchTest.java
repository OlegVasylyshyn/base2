package week1.day2;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {


        System.out.print("Enter your age - ");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();


        switch (userAge) {

            case 6 : {
                System.out.println("You have to go to school");
                break;
            }
            case 18 : {
                System.out.println("You have to go to university");
                break;
            }
            case 65 : {
                System.out.println("You have to go to pensia :)");
                break;
            }
            default: {
                System.out.println("you have nothing to do");
            }

        }

        String s = "wer";

        switch (s){
            case "wer" : {
                System.out.println("the same with numbers");
            }
        }

    }

}
