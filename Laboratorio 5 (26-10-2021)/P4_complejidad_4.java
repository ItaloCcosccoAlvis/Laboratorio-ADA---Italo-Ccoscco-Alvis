public class P4_complejidad_4 {
    public static void main(String[] args) {
        
        // Problema 4: ¿Cúal es la complejidad?
        int n = 10; //variable al azar
        
        // Bucle doble
        for(int i = 0; i < n; i++){ // O(n)
            for(int j = 0; j < n ; j++){ // O(n)
                System.out.println(i + "+" +"j" + "statement");
            }
        }
        // Complejidad: O(n^2)
    }
}
