package week4.day2.school;

// POJO
// JAVA BEANS
public abstract class Person {

    protected String name;

    protected static String schoolName = "SOME SCHOOL NAME";

    public Person(String name) {
        System.out.println("Person constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sayHello();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Teacher extends Person {

    private String degree;
    private Address address;


    static {
        System.out.println(schoolName + " started working");
    }

    {
        System.out.println("Non-static init");
        degree = "";
    }


    public Teacher(String degree, Address address, String name) {
        super(name);
        // non static init
        System.out.println("Teacher constructor");
        this.degree = degree;
        this.address = address;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from Teacher");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "degree='" + degree + '\'' +
                ", address=" + address +
                '}';
    }
}

class Student extends Person {

    private int averageMark;
    private Address address;

    public Student(int averageMark, Address address, String name) {
        super(name);
        System.out.println("Student constructor");
        this.averageMark = averageMark;
        this.address = address;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from Student");
    }

    @Override
    public String toString() {
        return "Student{" +
                "averageMark=" + averageMark +
                ", address=" + address +
                '}';
    }
}

class Address {

    private String city;
    private String street;

    public Address() {
    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

