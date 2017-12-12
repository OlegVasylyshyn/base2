package week2.day1;

public class ArraySearchTest {

    public static void main(String[] args) {

        int[] arr = new int[100_000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int number = 2023;
        boolean isIn = false;

        long startTime;
        long endTime;

        int countIteration = 0;


        // simple search

        startTime = System.nanoTime();
//        for (int i = 0; i < arr.length; i++) {
//            countIteration++;
//            if(arr[i] == number) {
//                isIn = true;
//                break;
//            }
//        }
        int start = 0, end = arr.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            countIteration++;
            if(arr[mid] == number){
                isIn = true;
                break;
            } else if (arr[mid] > number) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        endTime = System.nanoTime();

        System.out.println("Found - " + isIn);
        System.out.println("Iteration - " + countIteration);
        System.out.println("Time - " + (endTime - startTime));


    }

}
