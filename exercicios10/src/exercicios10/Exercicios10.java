package exercicios10;

public class Exercicios10 {

    public static boolean isFibonacci(int n) {

        if (n < 0) {
            return false;
        }

        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static boolean isPerfectSquare(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }

    public static void main(String[] args) {

        int[] testNumbers = {5, 10, 13, 21, 34, 50};

        for (int num : testNumbers) {
            if (isFibonacci(num)) {
                System.out.println(num + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(num + " não pertence à sequência de Fibonacci.");
            }
        }
    }
}
