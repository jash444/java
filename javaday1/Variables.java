// ==================== CLASS 1: DATA TYPES ====================
class DataTypes {
    public static void main(String[] args) {
        System.out.println("========== DATA TYPES ==========\n");
        
        // All 8 primitive data types
        int intVar = 10;
        System.out.println("Integer variable: " + intVar);
        System.out.println("Integer range: -2147483648 to 2147483647");
        
        long longVar = 10000000000L;
        System.out.println("\nLong variable: " + longVar);
        System.out.println("Long range: -9223372036854775808 to 9223372036854775807");
        
        double doubleVar = 3.14;
        System.out.println("\nDouble variable: " + doubleVar);
        System.out.println("Double range: 4.9E-324 to 1.7976931348623157E308");
        
        float floatVar = 5.5f;
        System.out.println("\nFloat variable: " + floatVar);
        System.out.println("Float range: 1.4E-45 to 3.4028235E38");
        
        byte byteVar = 100;
        System.out.println("\nByte variable: " + byteVar);
        System.out.println("Byte range: -128 to 127");
        
        short shortVar = 1000;
        System.out.println("\nShort variable: " + shortVar);
        
        boolean boolVar = true;
        System.out.println("\nBoolean variable: " + boolVar);
        System.out.println("Boolean can only take true or false values");
        
        char charVar = 'A';
        System.out.println("\nCharacter variable: " + charVar);
        System.out.println("Character range: 0 to 65535 (use single quotes)");
        
        // Non-primitive data type
        String stringVar = "Hello, Java!";
        System.out.println("\nString variable: " + stringVar);
        System.out.println("String uses double quotes");
        
        // Type Casting
        System.out.println("\n--- Type Casting ---");
        int x = 10;
        double y = x; // implicit casting
        System.out.println("Implicit casting (int to double): " + y);
        
        byte j = (byte) x;
        System.out.println("Explicit casting (int to byte): " + j);
        
        float q = 25f;
        int m = (int) q;
        System.out.println("Explicit casting (float to int): " + m);
    }
}

// ==================== CLASS 2: VARIABLES ====================
class Variables {
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

// ==================== CLASS 3: OPERATORS ====================
class Operators {
    public static void main(String[] args) {
        System.out.println("\n========== OPERATORS ==========\n");
        
        // Arithmetic Operators
        System.out.println("--- Arithmetic Operators ---");
        int num1 = 7;
        int num2 = 5;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println("Modulo: " + num1 + " % " + num2 + " = " + (num1 % num2));
        
        // Assignment Operators
        System.out.println("\n--- Assignment Operators ---");
        int a = 10;
        System.out.println("Assignment (=): a = " + a);
        a += 10;
        System.out.println("Addition assignment (+=): a = " + a);
        int b = 20;
        b -= 5;
        System.out.println("Subtraction assignment (-=): b = " + b);
        
        // Unary Operators
        System.out.println("\n--- Unary Operators ---");
        int p = 5;
        System.out.println("Post increment (p++): " + p++);
        System.out.println("Value after: " + p);
        int q = 5;
        System.out.println("Pre increment (++q): " + ++q);
        
        // Relational Operators
        System.out.println("\n--- Relational Operators ---");
        int a1 = 10;
        int a2 = 20;
        System.out.println("Less than (<): " + a1 + " < " + a2 + " = " + (a1 < a2));
        System.out.println("Greater than (>): " + a1 + " > " + a2 + " = " + (a1 > a2));
        System.out.println("Equal to (==): " + a1 + " == " + a2 + " = " + (a1 == a2));
        System.out.println("Not equal to (!=): " + a1 + " != " + a2 + " = " + (a1 != a2));
        
        // Logical Operators
        System.out.println("\n--- Logical Operators ---");
        boolean x1 = true;
        boolean y1 = false;
        System.out.println("Logical AND (&&): " + x1 + " && " + y1 + " = " + (x1 && y1));
        System.out.println("Logical OR (||): " + x1 + " || " + y1 + " = " + (x1 || y1));
        System.out.println("Logical NOT (!): !" + x1 + " = " + (!x1));
    }
}

// ==================== HELPER CLASS ====================
class Example {
    int instanceVariable = 5;
    String name = "John";
}
