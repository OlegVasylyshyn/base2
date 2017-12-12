package week2.day1;

public class ArrayCreateInitTest {

    public static void main(String[] args) {


        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("////////////////////////////////////////////");

        int[][] mtrx = new int[5][10];
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                mtrx[i][j] = i + j;
                System.out.print(" " + mtrx[i][j]);
            }
            System.out.println();
        }


    }

}
