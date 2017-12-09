package week1.day2.loops;

public class DoWhileTest {

    public static void main(String[] args) {

        // do statement; while (condition);

        int i = 0;
        do {

            System.out.println(i);
            if(i > 5) {
//                break;
                continue;
            }
            System.out.println(i);


        } while (i++ < 10);


    }

}
