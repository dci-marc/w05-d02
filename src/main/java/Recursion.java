import java.util.HashMap;
import java.util.Map;

public class Recursion {
    private final Map<Long, Long> memo = new HashMap<>();

    /**
     * Entry point
     * @param args arguments
     */
    public static void main(String[] args) {
        new Recursion();
    }

    /**
     * Constructor
     */
    Recursion() {
        System.out.printf("%s\n", "Factorial");
        factorial(5);
        System.out.printf("%s\n", "Fibonacci");
        fibonacci(7);
        System.out.printf("%s\n", "Count up");
        countUp(1, 5);
    }

    /**
     * @param start start
     * @param end end
     */
    void countUp(long start, long end) {
        if (start > end) {
            return;
        }

        System.out.println(start);
        countUp(start + 1, end);
    }

    /**
     * @param n number
     * @return factorial
     */
    long factorial(long n) {
        System.out.printf("%d\n", n);

        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    /**
     * @param n number
     * @return fibonacci
     */
    long fibonacci(long n) {
        System.out.printf("%d\n", n);
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }
}
