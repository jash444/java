
public class Loops {
    public static void main(String[] args) {
        System.out.println("\n========== LOOPS ==========\n");
        
        // For loop
        System.out.println("--- For Loop ---");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
        
        // While loop
        System.out.println("\n--- While Loop ---");
        int j = 0;
        while (j <= 5) {
            System.out.println("Iteration: " + j);
            j++;
        }
        
        // Do-while loop
        System.out.println("\n--- Do-While Loop ---");
        int k = 0;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 0);
    
}
}
