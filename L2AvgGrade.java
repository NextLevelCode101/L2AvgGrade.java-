import java.util.Scanner;

public class L2AvgGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter test score 1 (can be a decimal): ");
        double Score1 = scanner.nextDouble();

        System.out.println("Enter test score 2 (can be a decimal): ");
        double Score2 = scanner.nextDouble();

        System.out.println("Enter test score 3 (can be a decimal): ");
        double Score3 = scanner.nextDouble();

        double average = (Score1 + Score2 + Score3) / 3;

        System.out.println("-----     -----     -----     -----");
        System.out.println("-----     Hello " + name + "   -----");
        System.out.println("-----     -----     -----     -----");
        System.out.println("Your test average is: " + average);
        System.out.println("-----     -----     -----     -----");

        if (average >= 90) {
            System.out.println("Based on that average, your grade is: A");
        } else if (average >= 80) {
            System.out.println("Based on that average, your grade is: B");
        } else if (average >= 70) {
            System.out.println("Based on that average, your grade is: C");
        } else if (average >= 60) {
            System.out.println("Based on that average, your grade is: D");
        } else {
            System.out.println("Based on that average, your grade is: F");
        }

        scanner.close();
    }
}