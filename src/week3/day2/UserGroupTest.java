package week3.day2;


import java.util.Arrays;

public class UserGroupTest {

    public static void main(String[] args) {

        char symbol = 'F';
        char symbol2 = 'G';
        System.out.println((int) symbol);
        System.out.println((int) symbol2);

        User dex = new User("DEX", 33);
        System.out.println("User name - " + dex.getName());
        System.out.println("User age - " + dex.getAge());

        dex.setName("James");

        System.out.println("User name - " + dex.getName());
        System.out.println("User age - " + dex.getAge());


        UserGroup userGroup = new UserGroup();
        userGroup.addUser(dex);


        for (int i = 0; i < 50; i++) {
            userGroup.addUser(new User("DEX" + Math.random(), i));
        }


        System.out.println(Arrays.toString(userGroup.getUsers()));

        User[] getusers = userGroup.getUsers();
        getusers[5] = null;


        User[] users = userGroup.getUsers();
        showUsers(users);

        userGroup.removeUser("James");

        System.out.println("*************************");

        users = userGroup.getUsers();
        showUsers(users);


        System.out.println(userGroup.indexAt("DEX24"));

        System.out.println("###########################");

        User[] sort = userGroup.sort();
        showUsers(sort);


    }



    private static void showUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if(users[i] != null && users[i].getName() != null)
                System.out.println(users[i].getName());
        }
    }

}
