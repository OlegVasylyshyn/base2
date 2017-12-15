package week2.day2;

import java.util.Arrays;

public class ArrayToStringRecursive {

    public static void main(String[] args) {

        showArray(1, 2, 3, 4, 5);

    }

    private static void showArray(int... nums){
        if(nums.length < 1) return;
        System.out.println(nums[nums.length - 1]);
        showArray(Arrays.copyOf(nums, nums.length - 1));
    }

}
