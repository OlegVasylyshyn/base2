package week3.day2;

public class UserTest {

    public static void main(String[] args) {

        User dex = new User("DEX", 30);
        System.out.println(dex);


        // abstraction
        Object object = new User("James", 45);

        // polymorphism
        System.out.println(object.toString());


    }

}
