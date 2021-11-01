public class P11_complejidad_11 {
    public static void main(String[] args) {
        
        // Problema 11: ¿Cúal es la complejidad?
        int n = 10; //variable al azar
    
        for(int i = 0; i < n ; i = i*2){ 
            System.out.println(i + " :statement");
        }

        for(int i = 0; i < n ; i = i*2){ 
            System.out.println(i + " :statement");
        }
    // Complejidad: O(log2(n))
    /*
        ======== Primer for ========
         1 = 2^0
         2 = 2^1
         4 = 2^0
         .
         .
         .
         k = 2^k

         2^k = n
         k = log2(n)

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
         k + k = 2log2(n)

         
    */
    }    
}
