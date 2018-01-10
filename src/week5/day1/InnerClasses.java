package week5.day1;

import week4.day2.student.Student;
import week4.day2.student.StudentManager;

public class InnerClasses {

    private String name;
    private static String password;

    public void method(){

        class MethodLocalInner {

        }

        new MethodLocalInner();


        Student student = new Student() {
            // Anonymous class (extends Student)
        };

        StudentManager manager = new StudentManager(){
            // Anonymous class
            @Override
            public int displayMenu() {
                return 0;
            }

            @Override
            public void addNewStudent() {

            }

            @Override
            public void removedStudent() {

            }

            @Override
            public void displayStudents() {

            }
        };

    }

    public Inner getInner(){
        return new Inner();
    }

    public class Inner {
        public void method(){
            password = "";
            name = "";
        }
    }

    public static class StaticNested {
        public void method(){
            password = "";
        }
    }

}


class OuterClass{

}