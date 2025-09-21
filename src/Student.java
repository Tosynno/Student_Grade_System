import java.util.Arrays;

public class Student {
    // Encapsulation: Private fields (Day 17)
    private String name;
    private int id;
    private double[] grades; // Array to store multiple grades

    // Constructor (Day 16)
    public Student(String name, int id, double[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    // Getters and Setters (Day 17: Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
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

