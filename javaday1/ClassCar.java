public class Class {
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
    }
}
class Car {
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
}