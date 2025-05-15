
package exercicios01;

import java.util.Scanner;

public class Exercicios01 {
// Crie um método que receba um número inteiro e retorne true se for um número perfeito (a soma de 
// seus divisores próprios é igual ao número, ex: 6 = 1 + 2 + 3).
    
   
    
    
        
        
        
    
                
        public class NumeroPerfeito {
            
        }

    public static boolean NumeroPerfeito(int n) {
    
        if (n <= 1) {
            return false;
        }

        int somaDivisores = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == n;
    }
    
    public static void main(String[] args){
    
        System.out.println(NumeroPerfeito(6));  
        System.out.println(NumeroPerfeito(21));  
        System.out.println(NumeroPerfeito(12));  
        
        
    
    }
}
    
   

        
        
        
        
    
    

