package week2.day1;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {

        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(num));

        // O(n^2)
        for (int i = 0; i < num.length - 1; i++) {

            int min = i;
            for (int j = i; j < num.length - 1; j++) {
                if(num[min] > num[j + 1]){
                    min = j + 1;
                }
            }

            int tmp = num[i];
            num[i] = num[min];
            num[min] = tmp;
        }

        System.out.println(Arrays.toString(num));
    }

}
