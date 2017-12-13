package week2.day1;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(num));

        // O(n^2)
        for (int i = 0; i < num.length - 1; i++) {

            for (int j = 0; j < num.length - (1 + i); j++) {

                if(num[j] > num[j + 1]){
                    int tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
                }

            }

        }

        System.out.println(Arrays.toString(num));
    }

}
