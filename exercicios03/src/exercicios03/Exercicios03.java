
package exercicios03;


public class Exercicios03 {

  
    
     
      public class MaiorValorAbsoluto {
      }
    public static int maiorValorAbsoluto(int[] numeros) {
        int maior = 0;

        for (int numero : numeros) {
            int valorAbsoluto = Math.abs(numero);
            if (valorAbsoluto > maior) {
                maior = valorAbsoluto;
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int[] array = {-10, 5, -20, 15};
        int resultado = maiorValorAbsoluto(array);
        System.out.println("Maior valor absoluto: " + resultado);
    }
}

      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
