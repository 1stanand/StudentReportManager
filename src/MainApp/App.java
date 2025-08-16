package MainApp;

import Services.StudentServices;
import Utils.HelperClass;

public class App {
    private static StudentServices st = new StudentServices();

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        int choice;
        do {
            Menu.showMainMenu();
            choice = HelperClass.readInt("Select Your Option: ");
            switch (choice) {
                case 1:
                    st.registerStudent();
                    break;
                case 2:
                    st.showAllStudents();
                    break;
                case 3:
                    st.searchStudent();
                    break;
                default:
                    break;
            }
        } while (choice != 0);

    }

}
