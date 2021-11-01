public class P12_complejidad_12 {
    public static void main(String[] args) {
        
        // Problema 12: ¿Cúal es la complejidad?
        int n = 5; //variable al azar
    
        for(int i = 0; i < n ; i++){ 
            for (int j = 1; j < n; j = j*2) {
                System.out.println(i + " + " + j + " : statement");
            }
        }

    // Complejidad: n.log2(n)
    /*
        ======== Primer for ========
         O(n)

        ======== Segundo for ========
                1 = 2^0
         2 = 2^1
         4 = 2^0
         .
         .
         .
         k = 2^k

        2^k = n
        k = log2(n)

        ======== Final ========
         = n . log2(n)

         
    */
    }    
}
