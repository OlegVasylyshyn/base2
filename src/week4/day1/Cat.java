package week4.day1;

public class Cat extends Animal {
    public Cat() {
        super();
        System.out.println("Cat constructor");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
