package week4.day1;

public class Animal {

    public String name;
    public int age;

    public Animal() {
        super();
        System.out.println("Animal constructor");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
