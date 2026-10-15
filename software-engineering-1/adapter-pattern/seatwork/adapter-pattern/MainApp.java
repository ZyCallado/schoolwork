public class MainApp {
    public static void main(String[] args) {
        //Adaptees
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        //Adapters
        SchoolManagementApp attendanceSystemAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingSystemAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp librarySystemAdapter = new LibrarySystemAdapter(librarySystem);

        attendanceSystemAdapter.integrateSystem();
        gradingSystemAdapter.integrateSystem();
        librarySystemAdapter.integrateSystem();
    }
}
