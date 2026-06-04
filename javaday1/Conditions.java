
public class Conditions {
    public static void main(String[] args) {
        System.out.println("\n========== CONDITIONS ==========\n");
        
        // If statement
        System.out.println("--- If Statement ---");
        int num = 10;
        if (num > 0) 
            System.out.println(num + " is a positive number.");
        
        
        // If-else statement
        System.out.println("\n--- If-Else Statement ---");
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        
        // Else-if ladder
        System.out.println("\n--- Else-If Ladder ---");
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        // Switch statement
        System.out.println("\n--- Switch Statement ---");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
         // ternary operator
        System.out.println("\n--- Ternary Operator ---");
        int a = 10;
        int b = 20;
        String result = (a > b) ? "a is greater than b" : "b is greater than a";
        System.out.println(result); 
    }
  
    
}
