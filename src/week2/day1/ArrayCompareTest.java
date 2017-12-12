package week2.day1;

import java.util.Arrays;

public class ArrayCompareTest {

    public static void main(String[] args) {

        int[] numbers = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 2);
        }

        int[] numbers2 = new int[2];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = (int) (Math.random() * 2);
        }

        System.out.println("First array - " + Arrays.toString(numbers));
        System.out.println("Second array - " + Arrays.toString(numbers2));
        boolean equal = true;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != numbers2[i]){
                equal = false;
            }
        }


        if(equal) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are not equal");
        }

        System.out.println(Arrays.equals(numbers, numbers2));

    }

}
