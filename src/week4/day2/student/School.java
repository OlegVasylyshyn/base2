package week4.day2.student;

public class School {

    public static final int ADD_NEW_STUDENT = 1;
    public static final int REMOVE_STUDENT = 2;
    public static final int DISPLAY_ALL_STUDENTS = 3;
    public static final int EXIT = 9;

    private StudentManager manager = new StudentManagerImpl();

    public void run() {

        while (true) {

            switch (manager.displayMenu()) {
                case ADD_NEW_STUDENT: {
                    manager.addNewStudent();
                    break;
                }

                case REMOVE_STUDENT: {
                    manager.removedStudent();
                    break;
                }

                case DISPLAY_ALL_STUDENTS: {
                    manager.displayStudents();
                    break;
                }

                case EXIT: {
                    System.out.println("Bye");
                    return;
                }

            }

        }

    }

}
