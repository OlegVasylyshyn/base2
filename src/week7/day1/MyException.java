package week7.day1;

public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {


        try {
            throw new MyException("fsfsfds");
        } catch (MyException | MyRunTimeException e) {
            e.printStackTrace();
        }

    }
}
