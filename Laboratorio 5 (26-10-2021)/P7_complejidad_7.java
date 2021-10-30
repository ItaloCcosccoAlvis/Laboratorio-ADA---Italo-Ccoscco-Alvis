public class P7_complejidad_7 {
    public static void main(String[] args) {
        
        // Problema 7: ¿Cúal es la complejidad?
        int n = 10; //variable al azar
        
        for(int i = 1; i < n; i = i * 2){ // O(n)
           System.out.println(i + " :statement");
        }
        // Complejidad: O(log2(n))
        /*
         1 = 2^0
         2 = 2^1
         4 = 2^0
         .
         .
         .
         k = 2^k

        2^k = n
        k = log2(n)
        */
    }
}
