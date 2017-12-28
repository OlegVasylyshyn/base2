package week4.day2.student;

import java.util.Scanner;

public class School {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Choose your act");
        System.out.println("1) Add new student");
        System.out.println("2) Remove student");
        System.out.println("3) Show all students");
        System.out.println("4) Show all students (sorted)");
        System.out.println("5) Search");
        System.out.println("6) Display student with max mark");
        System.out.println("9) Exit");

        while (true) {

            int chosenNumber = scanner.nextInt();

            switch (chosenNumber) {

                case 1 : {

                    // TODO: 28.12.17 add new student

                    break;
                }

                case 2: {

                    // TODO: 28.12.17 remove student

                    break;
                }

                case 3: {

                    // TODO: 28.12.17 display all students

                    break;
                }

                case 9: {
                    System.out.println("Bye");
                    return;
                }


            }

        }



    }


}
