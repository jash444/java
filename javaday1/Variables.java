public class Variables {
    // Static variable (class variable)
    static int staticVariable = 50;
    
    // Instance variables (non-static)
    int instanceVariable = 5;
    String name = "John";
    
    public static void main(String[] args) {
        System.out.println("\n========== VARIABLES ==========\n");
        
        // Local variables
        System.out.println("--- Local Variables ---");
        int localVar1 = 10;
        int localVar2 = 20;
        int localVar3 = 30;
        System.out.println("Local variables are declared inside methods");
        System.out.println("Local Variable 1: " + localVar1);
        System.out.println("Local Variable 2: " + localVar2);
        System.out.println("Local Variable 3: " + localVar3);
        
        // Static variable
        System.out.println("\n--- Static Variable ---");
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Static variables are shared across all objects");
        
        // Instance variables
        System.out.println("\n--- Instance Variables ---");
        Variables obj = new Variables();
        System.out.println("Instance variable instanceVariable: " + obj.instanceVariable);
        System.out.println("Instance variable name: " + obj.name);
        System.out.println("Instance variables can be accessed using object");
        
        // Final variable (constant)
        System.out.println("\n--- Final Variable (Constant) ---");
        final int finalVar = 100;
        System.out.println("Final variable: " + finalVar);
        System.out.println("Final variables cannot be reassigned");
        
        // Literals
        System.out.println("\n--- Literals ---");
        int intLiteral = 10;
        double doubleLiteral = 3.14;
        String stringLiteral = "Hello, Java!";
        float floatLiteral = 5.5f;
        boolean boolLiteral = true;
        byte byteLiteral = 100;
        long longLiteral = 10000000000L;
        char charLiteral = 'A';
        System.out.println("Literals are the actual values assigned to variables");
        System.out.println("Examples: " + intLiteral + ", " + doubleLiteral + ", " + stringLiteral);
    }
}

class Example {
    int instanceVariable = 5;
    String name = "John";
}
