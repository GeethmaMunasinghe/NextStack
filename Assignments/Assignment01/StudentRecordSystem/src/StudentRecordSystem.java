import java.util.Scanner;

public class StudentRecordSystem {

        static final int MAX = 100;

        static String[] names = new String[MAX];
        static int[] rolls = new int[MAX];
        static int[] marks = new int[MAX];

        static int count = 0; // number of students currently stored

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                // Q1: Menu System
                System.out.println("\n===== Student Record Menu =====");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Search Student by Roll Number");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit Program");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addStudent(sc);
                        break;
                    case 2:
                        viewAll();
                        break;
                    case 3:
                        searchStudent(sc);
                        break;
                    case 4:
                        deleteStudent(sc);
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 5);

            sc.close();
        }

        // Add Student
        public static void addStudent(Scanner sc) {
            if (count >= MAX) {
                System.out.println("Cannot add more students. Limit reached.");
                return;
            }

            System.out.print("Enter Student Name: ");
            sc.nextLine(); // consume newline
            names[count] = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            rolls[count] = sc.nextInt();

            System.out.print("Enter Marks: ");
            marks[count] = sc.nextInt();

            count++; // increase count after adding
            System.out.println("Student added successfully!");
        }

        // View All Students
        public static void viewAll() {
            if (count == 0) {
                System.out.println("No students to display.");
                return;
            }

            System.out.println("\n---- Student List ----");
            for (int i = 0; i < count; i++) {
                System.out.println("Roll: " + rolls[i] + ", Name: " + names[i] + ", Marks: " + marks[i]);
            }
        }

        // Search Student by Roll Number
        public static void searchStudent(Scanner sc) {
            System.out.print("Enter roll number to search: ");
            int searchRoll = sc.nextInt();
            boolean found = false;

            for (int i = 0; i < count; i++) {
                if (rolls[i] == searchRoll) {
                    System.out.println("Student Found:");
                    System.out.println("Roll: " + rolls[i] + ", Name: " + names[i] + ", Marks: " + marks[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found.");
            }
        }

        // Delete Student by Roll Number (Optional)
        public static void deleteStudent(Scanner sc) {
            System.out.print("Enter roll number to delete: ");
            int deleteRoll = sc.nextInt();
            int index = -1;

            // find student
            for (int i = 0; i < count; i++) {
                if (rolls[i] == deleteRoll) {
                    index = i;
                    break;
                }
            }

            // if found, shift elements
            if (index != -1) {
                for (int i = index; i < count - 1; i++) {
                    names[i] = names[i + 1];
                    rolls[i] = rolls[i + 1];
                    marks[i] = marks[i + 1];
                }
                count--;
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student not found.");
            }
        }


}
