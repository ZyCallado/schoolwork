public class NewEraUniversity {
    public static void main(String[] args) {

        // College
        College college = new College("College of Informatics & Computing Studies");

        // Departments
        Department computerScience = new Department("Department of Computer Science");
        Department infoTech = new Department("Department of Information Technology");
        
        // Teachers
        Teacher teacher1 = new Teacher("Prof. Nelson C. Gaspar", "Applications Development", 500000.00);
        Teacher teacher2 = new Teacher("Prof. Era B. Espinas", "Automata", 450000.00);
        Teacher teacher3 = new Teacher("Prof. Jofrank David Riego", "Social Issues", 480000.00);

        // Students
        Student student1 = new Student("Mae Salcedo", "001", 15000.0);
        Student student2 = new Student("Zy Callado", "002", 15000.0);
        Student student3 = new Student("Zaya Benaldo", "003", 14000.0);
        Student student4 = new Student("Scarlet Sapphire", "004", 14000.0);

        computerScience.add(teacher1);
        computerScience.add(teacher2);
        computerScience.add(student1);
        computerScience.add(student2);

        infoTech.add(teacher3);
        infoTech.add(student3);
        infoTech.add(student4);

        college.add(computerScience);
        college.add(infoTech);

        System.out.println("=== College Details ===");
        college.displayDetails();

        int totalStudents = college.getNumberOfStudents();
        System.out.println("Total number of students in " + college.getName() + ": " + totalStudents);

        double totalBudget = college.getBudget();
        System.out.println("Total budget of " + college.getName() + ": ₱" + totalBudget);
    }
}