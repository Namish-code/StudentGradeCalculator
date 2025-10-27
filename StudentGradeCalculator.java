import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[] marks = new int[subjects];
        int total = 0;

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("❌ Invalid marks! Please enter between 0 and 100.");
                i--; // re-enter
                continue;
            }

            total += marks[i];
        }

        double average = (double) total / subjects;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n===== Report Card =====");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + " / " + (subjects * 100));
        System.out.printf("Average: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        if (grade == 'F') {
            System.out.println("Result: ❌ Fail");
        } else {
            System.out.println("Result: ✅ Pass");
        }

        sc.close();
    }
}
