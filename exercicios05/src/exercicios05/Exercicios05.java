package exercicios05;

public class Exercicios05 {

    public static int calcularFatorial(int n) {
        if (n < 0) {
            System.out.println("Fatorial não definido para números negativos");
            return -1;
        }
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(calcularFatorial(5));
        System.out.println(calcularFatorial(0));
        System.out.println(calcularFatorial(-3));
    }
}
