package week5.day2.builder;

public final class Car {

    private final String brand;
    private final int number;

    public Car(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return number;
    }

    public static class CarBuilder {

        private String brand;
        private int number;

        public CarBuilder() {
        }

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Car build(){
            return new Car(brand, number);
        }
    }

}
