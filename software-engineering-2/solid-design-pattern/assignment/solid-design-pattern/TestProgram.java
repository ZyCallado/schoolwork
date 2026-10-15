public class TestProgram {
    public static void main(String[] args) {

        Student student = new Student(123, "Thezza");

        LibraryResource book = new Book("Clean Code");
        LibraryResource journal = new Journal("IEEE Software");
        LibraryResource newspaper = new Newspaper("The Code Review");
        LibraryResource thesis = new Thesis("AI Research 2025");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(newspaper);
        student.borrowResource(thesis);
    }
}