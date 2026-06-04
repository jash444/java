public class Method {
    public static void main(String[] args) {
        System.out.println("\n========== CLASSES AND OBJECTS ==========\n");
        
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2020);
        
        // Accessing object properties
        System.out.println("Car Make: " + myCar.make);
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);
        
        // Calling a method on the object
        myCar.startEngine();
        System.out.println("\n========== METHOD OVERLOADING ==========\n");
        // Method overloading example
        myCar.displayInfo();
        myCar.displayInfo(true);    
    }
    static class Car {
        String make;
        String model;
        int year;
        
        Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }
        
        void startEngine() {
            System.out.println(make + " " + model + " engine started!");
        }
        
        // Method overloading: same method name but different parameters
        void displayInfo() {
            System.out.println("Car Information: " + make + " " + model + ", Year: " + year);
        }
        
        void displayInfo(boolean detailed) {
            if (detailed) {
                System.out.println("Detailed Car Information:");
                System.out.println("Make: " + make);
                System.out.println("Model: " + model);
                System.out.println("Year: " + year);
            } else {
                displayInfo();
            }
        }
    }
}