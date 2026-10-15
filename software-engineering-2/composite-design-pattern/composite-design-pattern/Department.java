import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationalUnit {
    private String name;
    private List<OrganizationalUnit> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(OrganizationalUnit unit) {
        units.add(unit);
    }

    public void remove(OrganizationalUnit unit) {
        units.remove(unit);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        for (OrganizationalUnit unit : units) {
            unit.displayDetails();
        }
    }

    @Override
    public int getNumberOfStudents() {
        int count = 0;
        for (OrganizationalUnit unit : units) {
            count += unit.getNumberOfStudents();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (OrganizationalUnit unit : units) {
            total += unit.getBudget();
        }
        return total;
    }
}