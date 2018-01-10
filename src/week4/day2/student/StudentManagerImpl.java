package week4.day2.student;

import java.util.Scanner;

public class StudentManagerImpl implements StudentManager {


    private Scanner scanner = new Scanner(System.in);
    private StudentGroup group = new StudentGroup();

    @Override
    public int displayMenu() {
        System.out.println("Choose your act");
        System.out.println("1) Add new student");
        System.out.println("2) Remove student");
        System.out.println("3) Show all students");
        System.out.println("4) Show all students (sorted)");
        System.out.println("5) Search");
        System.out.println("6) Display student with max mark");
        System.out.println("9) Exit");

        return scanner.nextInt();
    }

    @Override
    public void addNewStudent() {
        scanner.nextLine();
        System.out.println("Enter students name");
        String name = scanner.nextLine();
        System.out.println("Enter students age");
        int age = scanner.nextInt();
        System.out.println("Enter average mark");
        double averageMark = scanner.nextDouble();
        Student student = new Student(name, age, averageMark);
        group.addStudent(student);

        System.out.println("Student was successfully added");
    }

    @Override
    public void removedStudent() {
        scanner.nextLine();
        System.out.println("Enter students name for remove");
        String name = scanner.nextLine();
        if(group.removeStudent(name)) {
            System.out.println("Student was successfully removed");
        } else {
            System.out.println("Was not found");
        }
    }

    @Override
    public void displayStudents() {
        System.out.println();
        Student[] students = group.getStudents();
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null) continue;
            System.out.println(i + 1 + ")" + students[i]);
        }
        System.out.println();
    }
}
