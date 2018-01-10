package week4.day2.student;

public class Student {

    private String name;
    private int age;
    private double averageMark;

    public Student() {
    }

    public Student(String name, int age, double averaggeMark) {
        this.name = name;
        this.age = age;
        this.averageMark = averaggeMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averaggeMark) {
        this.averageMark = averaggeMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", averageMark=" + averageMark +
                '}';
    }
}
