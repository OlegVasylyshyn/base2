package week2.day2;

public class MethodExample {

    public static void main(String[] args) {

        // STATIC EXAMPLE
        int result = sum(2, 3);
        System.out.println(result);

        // NON-STATIC
        MethodExample methodExample = new MethodExample();
        result = methodExample.deduct(10, 3);
        System.out.println(result);

    }

    private static int sum(int x, int y){
        return x + y;
    }

    private int deduct(int x, int y){
        return x - y;
    }

}
