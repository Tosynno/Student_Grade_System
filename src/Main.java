//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Create a student object (Day 15: Objects)
        double[] grades = {85.5, 90.0, 78.5, 92.0};
        Student student1 = new Student("Alice Smith", 1001, grades);

        // Display student details
        student1.displayDetails();

        // Update grades using setter (Encapsulation)
        double[] newGrades = {95.0, 88.0, 91.5};
        student1.setGrades(newGrades);
        System.out.println("\nAfter updating grades:");
        student1.displayDetails();

        // Rest of the Student class (as above)
        // Include calculateAverage, getLetterGrade, etc.
        Students students = new Students("Alice Smith", 1001, new double[]{85.5, 90.0, 78.5});
        System.out.println("Role: " + students.getRole());
        students.displayDetails();
    }
}