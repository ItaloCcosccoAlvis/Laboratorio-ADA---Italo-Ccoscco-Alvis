public class P2_complejidad_2{
    public static void main(String[] args) {
        
        // Problema 2: ¿Cúal es la complejidad?
        int n = 10; //variable al azar
        
        // Bucle descendente
        for(int i = n; i > 0; i--){
            System.out.println("statement");
        }
        // Complejidad: O(n)
    }
}