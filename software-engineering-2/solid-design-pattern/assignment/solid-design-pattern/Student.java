public class Student {
    private int studentId;
    private String name;
    
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void borrowResource(LibraryResource libraryResource) {
        System.out.println("Student ID: " + studentId + "\nName: " + name);
        libraryResource.borrow();
    }
}