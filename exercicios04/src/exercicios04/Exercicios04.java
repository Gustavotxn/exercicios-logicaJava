
package exercicios04;


public class Exercicios04 {

   
  
     
    public class StringComMaisVogais {
    }
    public static String stringComMaisVogais(String[] palavras) {
        String resultado = "";
        int maxVogais = 0;

        for (String palavra : palavras) {
            int contador = contarVogais(palavra);
            if (contador > maxVogais) {
                maxVogais = contador;
                resultado = palavra;
            }
        }

        return resultado;
    }

    private static int contarVogais(String palavra) {
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (char c : palavra.toCharArray()) {
            if (vogais.indexOf(c) != -1) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        String[] palavras = {"banana", "melancia", "kiwi", "abacaxi"};
        String resultado = stringComMaisVogais(palavras);
        System.out.println("String com mais vogais: " + resultado);
    }
}
    
        
        
        
        
        
    
    

