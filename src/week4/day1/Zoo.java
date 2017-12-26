package week4.day1;

public class Zoo {
    public static void main(String[] args) {

        // abstraction
        Animal animal;
        Cat cat;

        // abstraction
        Object o = animal = new Dog();


        // polymorphism
        System.out.println(o);
        System.out.println(animal);

        o = "";
        if(o instanceof Animal) {
            System.out.println(true);
            System.out.println((Animal) o);
        }

        System.out.println(animal.getClass());
    }
}
