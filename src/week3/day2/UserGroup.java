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
        int index = indexAt(name);

        if (index == -1) return false;

        User[] newUsers = new User[users.length];
        System.arraycopy(users, 0, newUsers, 0, index);
        System.arraycopy(users, index + 1, newUsers, index, users.length - index - 1);
        users = newUsers;
        return true;
    }

    public int indexAt(String name){
        for (int i = 0; i < users.length; i++) {
            if(users[i] != null && users[i].getName() != null){
                if(users[i].getName().equals(name)){
                    return i;
                }
            }
        }
        return -1;
    }

    public User[] sort(){
        User[] clone = users.clone();

        for (int i = 0; i < users.length - 1; i++) {
            for (int j = 0; j < clone.length - (1 + i); j++) {

                if(clone[j] != null && clone[j].getName() != null && clone[j + 1] != null && clone[j + 1].getName() != null) {
                    if (clone[j].getName().compareTo(clone[j + 1].getName()) > 0) {
                        User tmp = clone[j];
                        clone[j] = clone[j + 1];
                        clone[j + 1] = tmp;
                    }
                }

            }
        }

        return clone;
    }

    public User getUser(int index) {
        return users[index];
    }

}
