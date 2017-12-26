package week4.day1;

public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Dog constructor");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
