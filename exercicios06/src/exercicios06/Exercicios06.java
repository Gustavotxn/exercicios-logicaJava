
package exercicios06;


public class Exercicios06 {

    

    
    public static boolean verificarPalindromo(String str) {
      
        str = str.replaceAll("\\s+", "").toLowerCase();
        
       
        int inicio = 0;
        int fim = str.length() - 1;
        
        while (inicio < fim) {
            if (str.charAt(inicio) != str.charAt(fim)) {
                return false; 
            }
            inicio++;
            fim--;
        }
        
        return true; 
    }

        public static void main(String[] args) {
        System.out.println(verificarPalindromo("radar"));     
        System.out.println(verificarPalindromo("deified")); 
        System.out.println(verificarPalindromo("hello"));     
        System.out.println(verificarPalindromo("A man a plan a canal Panama"));
    }
}
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    

