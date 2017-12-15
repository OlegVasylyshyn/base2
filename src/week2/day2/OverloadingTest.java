package week2.day2;

public class OverloadingTest {

    public static void main(String[] args) {

        sum(1, 2);
        sum(1, 2, 3);

    }

    private static int sum(int x, int y){
        System.out.println("1");
        return x + y;
    }

    private static int sum(int x, int y, int z){
        System.out.println("2");
        return x + y + z;
    }

    private static int sum(int... numbers){
        System.out.println("VARARGS");
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }


}
