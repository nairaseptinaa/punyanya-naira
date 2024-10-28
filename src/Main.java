
class Employee {
    public String name;
    public int id;
    public double salary;
    public String department;
    public static final double BONUS_RATE = 0.1;

    public Employee(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    // Extracted method to calculate bonus
    public double calculateBonus() {
        return salary * BONUS_RATE;
    }

    public void applyBonus() {
        salary += calculateBonus(); // Inline variable
        System.out.println("Bonus applied! New salary: " + salary);
    }

    public void updateDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("Department updated to: " + department);
    }
}

class Project {
    public String projectName;
    public String projectDeadline;
    public javadoc projectLeader;
    public double budget;

    public Project(String projectName, String projectDeadline, javadoc projectLeader, double budget) {
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
        this.projectLeader = projectLeader;
        this.budget = budget;
    }

    public void printProjectDetails() {
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Deadline: " + projectDeadline);
        System.out.println("Budget: " + budget);
        projectLeader.printDetails();
    }

    public void updateBudget(double newBudget) {
        budget = newBudget;
        System.out.println("Budget updated to: " + budget);
    }
}

class Client {
    public String clientName;
    public String clientEmail;
    public dokumentasi project;

    public Client(String clientName, String clientEmail, dokumentasi project) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.project = project;
    }

    public void printClientDetails() {
        System.out.println("Client Name: " + clientName);
        System.out.println("Client Email: " + clientEmail);
        project.printProjectDetails();
    }
}

// New Main class
class Main {
    public static void main(String[] args) {
        javadoc emp = new javadoc("John Doe", 12345, 75000, "Engineering");
        dokumentasi proj = new dokumentasi("AI Development", "2024-12-31", emp, 1000000);
        representclient client = new representclient("Acme Corp", "contact@acme.com", proj);

        client.printClientDetails();
        emp.applyBonus();
        emp.updateDepartment("Research and Development");
        proj.updateBudget(1200000);
    }
}



