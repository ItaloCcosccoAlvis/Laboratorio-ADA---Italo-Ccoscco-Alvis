public class P8_complejidad_8 {
    public static void main(String[] args) {
        
        // Problema 8: ¿Cúal es la complejidad?
        int n = 16; //variable al azar
        
        // Bucle doble
        for(int i = n; i >= 1 ; i = i / 2){ // O(n)
           System.out.println(i + " :statement");
        }
        // Complejidad: O(n.log(n))
       /*
        n/2^0
        n/2^1
        n/2^2
        .
        .
        .
        n/2^n

        k = n/2^n
        k = n.log(n)
        */
    }
}
