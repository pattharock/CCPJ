package smallproblems;
//Iterative fib -> Best
public class Fib3 {
    private static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = a + b;
        if (n < 2){
            return n;
        }

        for (int i = 0 ; i < n-2 ; i++) {
            a = b;
            b = c;
            c = a + b;
        }

        return c;
    }

    public static void main(String[] args) {
        System.out.println("fib(20): " + fib(20));
    }
}
