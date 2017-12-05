package week1.day1;

public class Primitives {

    public static void main(String[] args) {

        byte b = 10;
        System.out.println(b);

        // eight system
        b = 011;
        System.out.println(b);

        // 16 system
        b = 0xA;
        System.out.println(b);

        b = 0b1000000;  // 64
        System.out.println(b);

        long l = 1000000000000000L;

        float f = 4.5f;

        double d = 4.5;
        System.out.println(d);

        char c = 'B';

        boolean bool = true; // true, false

        System.out.println('\t' + "Hello");
        System.out.println('\u1241');

        // operators

        int age = 30, year = 2017;
        System.out.print("Birth day - ");
        System.out.println(year - age);

        // +, -, /, %, *.

        System.out.println(10 / 3);
        System.out.println(10 / 3.0);

        System.out.println(10 % 3);
        System.out.println(10 % 3.0);

        year = year - age;
        System.out.println(year);
        year = 2017;

        year -= age;
        System.out.println(year);


        int test = 10;
        test /= 3;
        System.out.println(test);

        System.out.println("pre increment");
        System.out.println(++test);
        System.out.println(test);

        System.out.println("post increment");
        System.out.println(test++);
        System.out.println(test);


        // boolean
        System.out.println("Boolean");
        System.out.println(true);
        System.out.println(!true);


        // cast
        // implicit
        int some = 10;
        long someLong = some;
        System.out.println(someLong);
        // explicit
        some = (int) someLong;
        System.out.println(some);

    }

}
