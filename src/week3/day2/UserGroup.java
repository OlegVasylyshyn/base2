package week3.day2;

public class UserGroup {

    private User[] users;
    private int size = 0;

    public UserGroup(){
        users = new User[20];
    }

    public void addUser(User user){
        if(users.length <= size){
            copyArray();
        }
        users[size++] = user;
    }

    private void copyArray() {
        User[] newUsers = new User[this.users.length * 2];
        System.arraycopy(users, 0, newUsers, 0, users.length);
        users = newUsers;
    }

    public int getGroupSize(){
        return size;
    }

    public User[] getUsers(){
        return users.clone();
    }

    public boolean removeUser(String name) {

        // TODO: 22.12.17 remove user by name
        // TODO: 22.12.17 return true if was found and removed an user

        return false;
    }

    public int indexAt(String name){

        // TODO: 22.12.17 find index of user

        return -1;
    }

    public User[] sort(){

        // TODO: 22.12.17 return sorted copy of users . Sorted by name

        return null;
    }

    public User getUser(int index) {
        return users[index];
    }

}
