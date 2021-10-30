public class P6_complejidad_6 {
    public static void main(String[] args) {
        
        // Problema 6: ¿Cúal es la complejidad?
        int n = 10; //variable al azar
        
        // Bucle simple con centinela
        int p = 0;
        for(int i = 0; i <= n; i++){ 
            p = p + i;
            System.out.println(p + " + " + i + ": statement");
        }
        // Complejidad: O(sqrt(n))
        /*
            1 0 + 1
            2 1 + 2
            3 1 + 2 + 3
            .
            .
            .
            k 1 + 2 + 3 + 4 + ... + k
             = k(k+1)/2 
            k(k+1)/2 > n
            k^2 = n
            k = sqrt(n)
        */
    }   
}
