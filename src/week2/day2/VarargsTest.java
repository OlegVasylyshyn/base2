package week2.day2;

public class VarargsTest {

    public static void main(String[] args) {

        System.out.println(sum());

        System.out.println(sum(1));

        System.out.println(sum(1, 1, 2, 4, 35));

    }

    private static int sum(int... numbers){
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }


}
