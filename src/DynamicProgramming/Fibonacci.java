package DynamicProgramming;

public class Fibonacci {

    public static int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(fib(4));
    }
}
