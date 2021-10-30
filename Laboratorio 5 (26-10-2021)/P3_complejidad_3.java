public class P3_complejidad_3 {
    public static void main(String[] args) {
        
        // Problema 3: ¿Cúal es la complejidad?
        int n = 10; //variable al azar
        
        // Bucle descendente
        for(int i = 0; i < n; i=i+2){
            System.out.println("statement");
        }
        // Complejidad: O(n)
    }
}
