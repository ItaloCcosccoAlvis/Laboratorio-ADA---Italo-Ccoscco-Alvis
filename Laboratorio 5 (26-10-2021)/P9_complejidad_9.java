public class P9_complejidad_9 {
    public static void main(String[] args) {
        
        // Problema 9: ¿Cúal es la complejidad?
        int n = 10; //variable al azar
    
        for(int i = 0; i*i < n ; i++){ 
            System.out.println(i + " :statement");
        }
    // Complejidad: O(sqrt(n))
        /*
            0
            1
            2
            .
            .
            .
            n
            n(n+1)/2 = k
            n^2 = k
            n = sqrt(n)
        */
    }
}
