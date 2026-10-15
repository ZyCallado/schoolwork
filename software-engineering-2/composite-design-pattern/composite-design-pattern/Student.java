public class Student implements OrganizationalUnit {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student: " + name + " | Student ID: " + studentId + " | Tuition Fee: ₱" + tuitionFee);
    }

    @Override
    public int getNumberOfStudents() {
        return 1;
    }

    @Override
    public double getBudget() {
        return tuitionFee * -1;
    }
}