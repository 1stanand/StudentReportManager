package Utils;

import java.util.Scanner;

import Student.Student;

public class HelperClass {
    private static final Scanner sc = new Scanner(System.in);

    public Student addStudent() {
        Student student = new Student();
        int roll = readInt("Enter Roll Number: ");
        String name = readLine("Enter Name: ");
        int marks = readInt("Enter Marks: ");
        student.setName(name);
        student.setRoll_no(roll);
        student.setMarks(marks);
        return student;
    }

    public static String readLine(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) { // ✅ check first
                int num = sc.nextInt();
                sc.nextLine(); // consume leftover newline
                return num;
            } else {
                System.out.println("⚠️ Invalid input! Please enter a number.");
                sc.nextLine(); // discard the bad input
            }
        }
    }
}