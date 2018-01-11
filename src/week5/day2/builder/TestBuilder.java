package week5.day2.builder;

import static week5.day2.builder.Car.CarBuilder;

public class TestBuilder {

    public static void main(String[] args) {

        CarBuilder carBuilder = new CarBuilder();

        Car car = carBuilder
                .setNumber(1421241)
                .setBrand("fasfaf")
                .build();

    }

}
