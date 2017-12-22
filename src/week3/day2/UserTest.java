package week3.day2;


import java.util.Arrays;

public class UserTest {

    public static void main(String[] args) {

        User dex = new User("DEX", 33);
        System.out.println("User name - " + dex.getName());
        System.out.println("User age - " + dex.getAge());

        dex.setName("James");

        System.out.println("User name - " + dex.getName());
        System.out.println("User age - " + dex.getAge());


        UserGroup userGroup = new UserGroup();
        userGroup.addUser(dex);


        for (int i = 0; i < 50; i++) {
            userGroup.addUser(new User("DEX", i));
        }


        System.out.println(Arrays.toString(userGroup.getUsers()));

        User[] getusers = userGroup.getUsers();
        getusers[5] = null;

        System.out.println(Arrays.toString(userGroup.getUsers()));
    }

}
