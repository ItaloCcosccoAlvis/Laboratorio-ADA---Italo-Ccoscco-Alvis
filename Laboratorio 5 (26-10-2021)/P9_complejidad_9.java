public class P9_complejidad_9 {
    public static void main(String[] args) {
        
    // Problema 9: ¿Cúal es la complejidad?
    int n = 16; //variable al azar
    
    for(int i = 0; i*i < n ; i++){ 
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
