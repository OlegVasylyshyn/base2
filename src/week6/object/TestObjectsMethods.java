package week6.object;

public class TestObjectsMethods {

    public static void main(String[] args) {

        Car car = new Car();
        car.setBrand("BMW");
        car.setColor("BLACK");
        Engine engine = new Engine("Electric", "100");
        car.setEngine(engine);
        car.setNumber(123);


        System.out.println(car);

        System.out.println(car.getClass().getName());
        System.out.println(Car.class.getName());

        System.out.println(Integer.toHexString(car.hashCode()));


        Car car2 = car.clone();
        engine.setPower("100");


        System.out.println(car2);


        System.out.println("Car equals - " + car.equals(car2));
        System.out.println(car == car2);

        System.out.println(new int[]{1, 2, 3}.equals(new int[]{1, 2, 3}));

        String name = "DEX";
        String name2 = "DEX";

        System.out.println(name == name2);


        String name3 = new String("DEX");
        String name4 = new String("DEX");

        System.out.println(name3 == name4);


        car = null;
        System.gc();

    }

}
