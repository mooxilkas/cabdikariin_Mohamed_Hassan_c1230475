import java.util.Scanner;
public class studentGradeMS {
        // These are used to store student names and grades
        static String[] studentNames = new String[10];
        static int[] studentGrades = new int[10];
        static int totalStudents = 0;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int choice;

            do {
                // Show the menu
                System.out.println("\nStudent Grade Management");
                System.out.println("1. Add Student");
                System.out.println("2. Show Report");
                System.out.println("3. Search Student");
                System.out.println("4. Exit");
                System.out.print("Enter your choice (1-4): ");
                choice = input.nextInt();

                if (choice == 1) {
                    addStudent(input);
                } else if (choice == 2) {
                    showReport();
                } else if (choice == 3) {
                    searchStudent(input);
                } else if (choice == 4) {
                    System.out.println("Goodbye!");
                } else {
                    System.out.println("Wrong choice, try again.");
                }

            } while (choice != 4);
        }

        public static void addStudent(Scanner input) {
            input.nextLine(); // Clear input buffer
            if (totalStudents >= 10) {
                System.out.println("Cannot add more students.");
                return;
            }

            System.out.print("Enter student name: ");
            studentNames[totalStudents] = input.nextLine();

            System.out.print("Enter student grade: ");
            studentGrades[totalStudents] = input.nextInt();

            totalStudents++;
            System.out.println("Student added.");
        }

        public static void showReport() {
            if (totalStudents == 0) {
                System.out.println("No students to show.");
                return;
            }

            int sum = 0;
            int highest = studentGrades[0];
            int lowest = studentGrades[0];

            for (int i = 0; i < totalStudents; i++) {
                sum += studentGrades[i];
                if (studentGrades[i] > highest) {
                    highest = studentGrades[i];
                }
                if (studentGrades[i] < lowest) {
                    lowest = studentGrades[i];
                }
            }

            double average = (double) sum / totalStudents;

            System.out.println("Total Students: " + totalStudents);
            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        }

        public static void searchStudent(Scanner input) {
            input.nextLine(); // Clear input buffer
            System.out.print("Enter student name to search: ");
            String name = input.nextLine();

            boolean found = false;

            for (int i = 0; i < totalStudents; i++) {
                if (studentNames[i].equalsIgnoreCase(name)) {
                    System.out.println("Found " + studentNames[i] + " with grade " + studentGrades[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found.");
            }
        }
    }

