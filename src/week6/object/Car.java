package week6.object;

import java.util.Objects;

public class Car implements Cloneable {

    private String brand;
    private int number;
    private Engine engine;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 5 rules
    // x = x -> true
    // x = y -> y = x
    // x = z, y = z -> x = y
    // x != null
    // x = y ... x = y
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;

        if(!(obj instanceof Car)) {
            return false;
        }

        Car car = (Car) obj;
        if(car.number != number) return false;
        if(!car.brand.equals(((Car) obj).brand)) return false;
        if(!car.engine.equals(engine)) return false;
        if(!car.color.equals(color)) return false;

        return true;
    }

    @Override
    public int hashCode() {

        return Objects.hash(brand, number, engine, color);
    }

    @Override
    protected Car clone() {
        try {
            Car clone = (Car) super.clone();
//            clone.setEngine(engine.clone());
            clone.engine = new Engine(engine);
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("KILLED");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", number=" + number +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                '}';
    }
}
