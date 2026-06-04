public class Array {

    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Accessing array elements
        System.out.println("First element: " + numbers[0]); // Output: 1
        System.out.println("Second element: " + numbers[1]); // Output: 2

        // Modifying an array element
        numbers[2] = 10; // Changing the third element to 10
        System.out.println("Modified third element: " + numbers[2]); // Output: 10

        // Iterating through the array
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Creating an array of strings
        String[] fruits = { "Apple", "Banana", "Cherry" };
        System.out.println("Fruits in the array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // create an array of Numbers
        Number[] numArray = { 1, 2.5, 3L, 4.0f }; // Array of Numbers (Integer, Double, Long, Float)
        System.out.println("Numbers in the array:");
        for (Number num : numArray) {
            System.out.println(num);
        }
        int num[] = new int[5]; // Array of integers with size 5
        System.out.println("Default values in the integer array:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]); // Output: 0 (default value for int)
        }
        // multidimensional array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Multidimensional array (matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        int twoD[][] = new int[2][3]; // 2D array with 2 rows and 3 columns
        System.out.println("\nDefault values in the 2D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                twoD[i][j] = (int) (Math.random() * 10);
                // Assigning random integer values to the 2D array
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println("\n");
        }
        for (int[] n : twoD) {
            for (int m : n) {
                System.out.print(n + " ");
            }
        }
        // jagged array
        int[][] jaggedArray = new int[3][];
        for (int i = 0; i < jaggedArray.length; i++) {
            jaggedArray[i] = new int[(int) (Math.random() * 28 + 1)]; // Each row has a different number of columns
        }
        System.out.println("Jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (int) (Math.random() * 10);
                // Assigning random integer values to the jagged array
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        // 3D array
        int[][][] threeDArray = new int[2][2][2]; // 3D array with dimensions 2x2x2
        System.out.println("3D array:");
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    threeDArray[i][j][k] = (int) (Math.random() * 10);
                    // Assigning random integer values to the 3D array
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        // draw back of arrays
        // 1. Fixed size: Once an array is created, its size cannot be changed. This can
        // lead to wasted memory if the array is larger than needed or insufficient
        // space if it's too small.
        // 2. Homogeneous data: Arrays can only store elements of the same type. This
        // can be limiting when you want to store different types of data together.
        // 3. No built-in methods: Unlike other data structures like ArrayList, arrays
        // do not have built-in methods for common operations such as adding, removing,
        // or searching for elements. This can make array manipulation more cumbersome
        // and error-prone.
        // 4. Performance issues: Inserting or deleting elements in an array can be
        // inefficient, especially if it requires shifting elements to maintain order.
        // This can lead to performance issues in scenarios where frequent modifications
        // are needed.
        // 5. Lack of flexibility: Arrays do not provide the flexibility of dynamic
        // resizing or the ability to easily grow and shrink as needed, which can be a
        // significant drawback in many applications where the size of the data is not
        // known in advance.

        // Array of objects
        Car[] cars = {
                new Car("Toyota", "Camry", 2020),
                new Car("Honda", "Civic", 2021),
                new Car("Ford", "Mustang", 2022)
        };
        System.out.println("Array of Car objects:");
        for (Car car : cars) {
            System.out.println(car.make + " " + car.model + " (" + car.year + ")");
        }
        // Printing the array reference (will print the memory address)
        System.out.println(cars + "n");
        // enhanced for loop to print the array reference (will print the memory address of each Car object)

        for (Car car : cars) {
            System.out.println(car + "n");
        }   
    
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
