package Services;

import java.util.Scanner;

import MainApp.Menu;
import Student.Student;
import Utils.HelperClass;

public class StudentServices {
    private static Student[] students = new Student[100];
    private static int count = 0;

    public void registerStudent() {
        HelperClass helperClass = new HelperClass();
        Student student = helperClass.addStudent();
        students[count] = student;
        count++;
        System.out.println("_____________________________________________________________________");
        System.out.println("Student Added SuccessFully....!!!");
        System.out.println("_____________________________________________________________________");

    }

    public void showAllStudents() {
        System.out.println("_____________________________________________________________________");
        for (int i = 0; i < count; i++) {
            students[i].displayStudent();
        }
        System.out.println("_____________________________________________________________________");
    }

    public void searchStudent() {
        Menu.searchStudentMenu();
        int choice = HelperClass.readInt("Select Your Option: ");
        switch (choice) {
            case 1:
                searchByName();
                break;
            case 2:
                searchByRollNumber();
                break;
            default:
                break;
        }

    }

    private void searchByName() {
        System.out.println("_____________________________________________________________________");
        System.out.print("Enter the Name of Student: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                students[i].displayStudent();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student With Name " + name + " has Not yet been Added");
        }
        System.out.println("_____________________________________________________________________");

    }

    private void searchByRollNumber() {
        System.out.println("_____________________________________________________________________");
        int roll = HelperClass.readInt("Enter the Roll Number of Student: ");
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (students[i].getRoll_no() == roll) {
                students[i].displayStudent();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student With Roll Number " + roll + " has Not yet been Added");
        }
        System.out.println("_____________________________________________________________________");

    }
}
