public class P10_complejidad_10 {
    public static void main(String[] args) {
        
        // Problema 9: ¿Cúal es la complejidad?
        int n = 10; //variable al azar
    
        for(int i = 0; i < n ; i++){ //O(n)
            System.out.println(i + " :statement");
        }

        for(int i = 0; i < n ; i++){ //O(n)
            System.out.println(i + " :statement");
        }
    // Complejidad: O(n)
    /*
        n

        n

        2n = k
        n = k
    */
    } 
}
