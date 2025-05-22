package exercicios07;

public class Exercicios07 {

    public static int calcularMDC(int a, int b) {

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(calcularMDC(56, 98));
        System.out.println(calcularMDC(101, 10));
        System.out.println(calcularMDC(35, 10));
    }
}
