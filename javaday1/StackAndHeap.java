public class StackAndHeap { 
    public static void main(String[] args) {
        // Stack example
        int a = 10; // 'a' is stored in the stack
        int b = 20; // 'b' is stored in the stack
        int sum = a + b; // 'sum' is stored in the stack
        System.out.println("Sum: " + sum);
        
        // Heap example
        Car myCar = new Car("Honda", "Civic", 2022); // 'myCar' reference is stored in the stack, but the Car object is stored in the heap
        System.out.println("Car Make: " + myCar.make);
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);
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
    }

    
}
