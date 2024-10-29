public class Recursion {
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
        System.out.printf("%d\n", factorial(5));
        System.out.printf("%d\n", fibonacci(5));
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
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
