public class Operators {
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
