package exercicios09;

public class Exercicios09 {

    public static double calcularPorcentagem(double valorTotal, double porcentagem) {
        return (valorTotal * porcentagem) / 100;
    }

    public static void main(String[] args) {

        double valorTotal = 200.0;
        double porcentagem = 15.0;

        double valorCalculado = calcularPorcentagem(valorTotal, porcentagem);

        System.out.printf("%.2f%% de %.2f é %.2f%n", porcentagem, valorTotal, valorCalculado);
    }
}


    

