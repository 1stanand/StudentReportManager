package MainApp;

public class Menu {
    private static final String LINE = "==============================================================";

    public static void showMainMenu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println();
        System.out.println(LINE);
        System.out.println("              Student Report Manager");
        System.out.println(LINE);
        System.out.println("1) Add Student");
        System.out.println("2) View Students");
        System.out.println("3) Search Student");
        System.out.println("4) Update Student Data");
        System.out.println("0) Exit");
        System.out.println(LINE);
        System.out.println();
    }

    public static void searchStudentMenu() {
        System.out.println(LINE);
        System.out.println("1) Search By Name");
        System.out.println("2) Search By Roll Number");
        System.out.println(LINE);
        System.out.println();
    }
}
