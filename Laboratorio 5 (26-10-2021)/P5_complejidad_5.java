public class P5_complejidad_5 {
    public static void main(String[] args) {
        
        // Problema 5: ¿Cúal es la complejidad?
        int n = 10; //variable al azar
        
        // Bucle doble
        for(int i = 0; i < n; i++){ // O(n)
            for(int j = 0; j < i ; j++){ // O(n)
                System.out.println(i + "+" + j + ": statement");
            }
        }
        // Complejidad: O(n^2)
    } 
}
