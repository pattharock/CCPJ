package smallproblems;

import java.util.stream.IntStream;

// Using Stream to calculate fib upto N
public class FibStream {
    private int last = 0; // fib(0)
    private int next = 1; // fib(1)

    private IntStream stream() {
        return IntStream.generate(() -> {
            int oldLast = last;
            last = next;
            next = oldLast + next;
            return oldLast;
        });
    }
    public static void main(String[] args) {
        FibStream fs = new FibStream();
        fs.stream().limit(41).forEachOrdered(System.out::println);
    }
}
