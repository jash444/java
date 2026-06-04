public class DataTypes {
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
