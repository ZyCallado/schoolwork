public class Thesis implements LibraryResource {
    private String title;

    public Thesis(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing thesis: " + title + "\n");
    }
}