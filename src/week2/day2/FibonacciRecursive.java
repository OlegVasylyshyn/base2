package week2.day2;

public class FibonacciRecursive {


    public static void main(String[] args) {
        System.out.println(f(7));
    }


    private static int f(int n){
        return n < 3 ? 1 : f(n -1) + f(n - 2);
    }

}
