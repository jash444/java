public class Strings {
    public static void main(String[] args) {
        // Creating a string using a string literal
        String greeting = "Hello, World!";
        
        // Creating a string using the new keyword
        String name = new String("Alice");
        
        // Printing the strings
        System.out.println(greeting);
        System.out.println(name);
        
        // Concatenating strings
        String fullGreeting = greeting + " My name is " + name + ".";
        System.out.println(fullGreeting);
        
        // Using String methods
        System.out.println("Length of greeting: " + greeting.length());
        System.out.println("Uppercase greeting: " + greeting.toUpperCase());
        System.out.println("Does greeting contain 'World'? " + greeting.contains("World"));
        System.out.println("Substring of greeting: " + greeting.substring(7, 12));
        System.out.println("Index of 'World' in greeting: " + greeting.indexOf("World"));
        System.out.println("Replace 'World' with 'Java': " + greeting.replace("World", "Java"));
        // Comparing strings
        String anotherGreeting = "Hello, World!";
        System.out.println("Is greeting equal to anotherGreeting? " + greeting.equals(anotherGreeting));
        System.out.println("Is greeting equal to name? " + greeting.equals(name));
        // Using StringBuilder for mutable strings
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");              
        stringBuilder.append(", ");
        stringBuilder.append("StringBuilder!");
        System.out.println(stringBuilder.toString()); 
        //mutable strings using StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(", ");
        stringBuffer.append("StringBuffer!");
        System.out.println(stringBuffer.toString());    

        String myname = "Akhil";
       // myname[0]= 'B'; // This will cause a compile-time error because strings are immutable in Java
        System.out.println("My name is " + myname); 
        myname = "Bob"; // This is allowed because we are reassigning the reference to a new string object
        System.out.println("My name is now " + myname);
        // Strings are immutable; to "change" a character create a new string
        myname = 'C' + myname.substring(1); // replace first character with 'C'
        // myname[2] = myname.charAt(1); // Invalid: strings are not arrays and are immutable in Java
        System.out.println("My name is now " + myname);
        // difference between String, StringBuilder, and StringBuffer
        String str1 = "Hello"; // String literal, immutable
        String str2 = new String("Hello"); // String object, immutable
        StringBuilder strBuilder = new StringBuilder("Hello"); // Mutable string builder
        StringBuffer strBuffer = new StringBuffer("Hello"); // Mutable string buffer
        System.out.println("String str1: " + str1);
        System.out.println("String str2: " + str2);
        System.out.println("StringBuilder strBuilder: " + strBuilder.toString());
        System.out.println("StringBuffer strBuffer: " + strBuffer.toString());   
        // String concatenation with StringBuilder and StringBuffer
        strBuilder.append(" World");
        strBuffer.append(" World");
        System.out.println("StringBuilder after concatenation: " + strBuilder.toString());
        System.out.println("StringBuffer after concatenation: " + strBuffer.toString());    
        // String immutability demonstration
        String original = "Hello";
        String modified = original.replace('H', 'J'); // Creates a new string "Jello"
        System.out.println("Original string: " + original);
        System.out.println("Modified string: " + modified);     
            // String interning 
        String interned1 = "Hello"; // This string is interned
        String interned2 = "Hello"; // This will reference the same interned string
        String nonInterned = new String("Hello"); // This creates a new string object on the heap
        System.out.println("interned1 == interned2: " + (interned1 == interned2)); // true, both reference the same interned string
        System.out.println("interned1 == nonInterned: " + (interned1 == nonInterned)); // false, interned1 references the interned string, while nonInterned references a different object on the heap
        System.out.println("interned1.equals(nonInterned): " + interned1.equals(nonInterned)); // true, both strings have the same content          
        // String immutability and memory usage
        String strA = "Hello";
        String strB = strA; // strB references the same string object as strA
        strA = "Hello, World!"; // strA now references a new string object
        System.out.println("strA: " + strA); // Output: Hello, World!
        System.out.println("strB: " + strB); // Output: Hello
        // String concatenation and memory usage
        String strC = "Hello";
        // for (int i = 0; i < 1000; i++) {
        //     strC += " World"; // This creates a new string object in each iteration, which can lead to high memory usage and poor performance
        // }
        System.out.println("Final string: " + strC); // Output: Hello World World World ... (repeated 1000 times)
        // Using StringBuilder to avoid memory issues with string concatenation
        StringBuilder strD = new StringBuilder("Hello");
        // for (int i = 0; i < 1000; i++) {
        //     strD.append(" World"); // This modifies the existing StringBuilder object without creating new string       

        // }
        System.out.println("Final StringBuilder string: " + strBuilder); // Output: Hello World World World ... (repeated 1000 times)
        // delete the car in stringBuffer
        StringBuffer strE = new StringBuffer("Hello, Car!");
        strE.delete(7, 11); // Deletes "Car"
        System.out.println("StringBuffer after deletion: " + strE.toString()); // Output: Hello, !
        //replace "Car" with "Bike" in stringBuffer
        strE.replace(7, 7, "Bike"); // Inserts "Bike" at index 7
        System.out.println("StringBuffer after replacement: " + strE.toString()); // Output: Hello, Bike!   
        // capatie of stringBuffer
        System.out.println("Capacity of StringBuffer: " + strE.capacity()); // Output:

    }
    
}
