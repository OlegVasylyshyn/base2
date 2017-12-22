package week3.day2;

public class User {

    private String name;
    private int age;
    private String password;


    public User(){
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
