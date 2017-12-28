package week4.day2.school;

public class StudentTest {

    public static void main(String[] args) {

        Person teacher = new Teacher("DOCTOR", new Address("Lviv", "UPA"), "Galina Michalovna");
        System.out.println(teacher);

        teacher.sayHello();

        System.out.println();
        System.out.println();

        new Student(4, new Address("Kyiv", "Hreschatyk"), "Dex").sayHello();

    }

}
