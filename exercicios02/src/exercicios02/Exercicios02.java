
package exercicios02;


public class Exercicios02 {

   
   
   
       public static String substituirVogaisPorAsteriscos(String entrada) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);

            if (Vogal(c)) {
                resultado.append('*');
            } else {
                resultado.append(c);
            }
        }

        return resultado.toString();
    }

    public static boolean Vogal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        String original = "Java sem métodos prontos";
        String modificada = substituirVogaisPorAsteriscos(original);

        System.out.println("Original:   " + original);
        System.out.println("Modificada: " + modificada);  
        
        
        
        
    }
    
}
