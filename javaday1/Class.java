public class Class {
    public static void main(String[] args) {
        String name = "Akhil";
        int age = 25;
        String gender = "Male";
        Student student = new Student(name, age, gender);
        student.displayInfo();
    }

    static class Student {
        String name;
        int age;
        String gender;

     public Student(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
        }
    }
}