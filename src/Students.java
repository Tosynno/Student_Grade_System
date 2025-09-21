import java.util.Arrays;

// Student class inheriting from Person (Day 18: Inheritance)
public class Students extends Person {
    private double[] grades;

    public Students(String name, int id, double[] grades) {
        super(name, id); // Call parent constructor
        this.grades = grades;
    }

    public Students(String name, int id) {
        super(name, id);
    }

    // Override abstract method (Day 19: Polymorphism)
    @Override
    public String getRole() {
        return "Student";
    }
    // Calculate average grade
    public double calculateAverage() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Determine letter grade based on average
    public char getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Grades: " + Arrays.toString(grades));
        System.out.printf("Average Grade: %.2f%n", calculateAverage());
        System.out.println("Letter Grade: " + getLetterGrade());
    }
}