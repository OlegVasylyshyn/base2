package week2.day1;

import week3.day2.User;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(num));

        // simple copy
        int[] nums2 = new int[num.length];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = num[i];
        }
        System.out.println(Arrays.toString(nums2));

        // clone
        int[] nums3 = num.clone();
        num[2] = 99999;
        System.out.println(Arrays.toString(nums3));


        // Arraycopy
        int[] nums4 = new int[10];
        System.arraycopy(num, 3, nums4, 0, nums4.length);
        System.out.println(Arrays.toString(nums4));

        // Array copyOf
        int[] nums5 = Arrays.copyOf(num, 10);
        System.out.println(Arrays.toString(nums5));

    }

}
