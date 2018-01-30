package week7.day1;

public class ThrowableTest {

    public static void main(String[] args) {

        try {
            throwEx();
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
        }
        System.out.println("After stack trace");

    }

    private static void throwEx() throws Throwable {

        String s = "wer";
        if("wer".equals(s)) throw new Throwable("Something happened");

        System.out.println("fasfaf");

    }

}
