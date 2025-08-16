package Utils;

import java.util.Scanner;

import Student.Student;

public class HelperClass {
    private static final Scanner sc = new Scanner(System.in);

    public Student addStudent() {
        Student student = new Student();
        int roll = readInt("Enter Roll Number: ");
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        int marks = readInt("Enter Marks: ");
        student.setName(name);
        student.setRoll_no(roll);
        student.setMarks(marks);
        return student;
    }

    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) { // ✅ check first
                int num = sc.nextInt();
                sc.nextLine(); // consume leftover newline
                return num;
            } else {
                System.out.print("⚠️ Invalid input! Please enter a number.");
                sc.nextLine(); // discard the bad input1
            }
        }
    }
}