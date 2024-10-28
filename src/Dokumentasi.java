/**
 * Represents an employee in the company.
 */
class javadoc {
    /**
     * The name of the employee.
     */
    public String name;

    /**
     * The unique identifier for the employee.
     */
    public int id;

    /**
     * The salary of the employee.
     */
    public double salary;

    /**
     * The department the employee belongs to.
     */
    public String department;

    /**
     * The bonus rate applied to the employee's salary.
     */
    public static final double BONUS_RATE = 0.1;

    /**
     * Constructs an Employee object with the given name, ID, salary, and department.
     *
     * @param name        The name of the employee.
     * @param id          The unique identifier for the employee.
     * @param salary      The salary of the employee.
     * @param department  The department the employee belongs to.
     */
    public javadoc(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    /**
     * Sets the name of the employee.
     *
     * @param name  The new name for the employee.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the ID of the employee.
     *
     * @param id  The new ID for the employee.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the salary of the employee.
     *
     * @param salary  The new salary for the employee.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Sets the department of the employee.
     *
     * @param department  The new department for the employee.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Prints the details of the employee.
     */
    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    /**
     * Calculates the bonus for the employee based on the salary and bonus rate.
     *
     * @return  The calculated bonus amount.
     */
    public double calculateBonus() {
        return salary * BONUS_RATE;
    }

    /**
     * Applies the bonus to the employee's salary.
     */
    public void applyBonus() {
        salary += calculateBonus(); // Inline variable
        System.out.println("Bonus applied! New salary: " + salary);
    }

    /**
     * Updates the department of the employee.
     *
     * @param newDepartment  The new department for the employee.
     */
    public void updateDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("Department updated to: " + department);
    }
}

/**
 * Represents a manager in the company.
 */
class Manager extends javadoc {
    /**
     * The additional bonus rate for managers.
     */
    public static final double MANAGER_BONUS_RATE = 0.2;

    /**
     * Constructs a Manager object with the given name, ID, salary, and department.
     *
     * @param name        The name of the manager.
     * @param id          The unique identifier for the manager.
     * @param salary      The salary of the manager.
     * @param department  The department the manager belongs to.
     */
    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary, department);
    }

    /**
     * Calculates the bonus for the manager based on the salary and manager bonus rate.
     *
     * @return  The calculated bonus amount.
     */
    @Override
    public double calculateBonus() {
        return salary * MANAGER_BONUS_RATE;
    }
}

/**
 * Represents a project within the company.
 */
class dokumentasi {
    /**
     * The name of the project.
     */
    public String projectName;

    /**
     * The deadline for the project.
     */
    public String projectDeadline;

    /**
     * The leader of the project.
     */
    public javadoc projectLeader;

    /**
     * The budget allocated for the project.
     */
    public double budget;

    /**
     * Constructs a Project object with the given name, deadline, project leader, and budget.
     *
     * @param projectName    The name of the project.
     * @param projectDeadline  The deadline for the project.
     * @param projectLeader  The leader of the project.
     * @param budget         The budget allocated for the project.
     */
    public dokumentasi(String projectName, String projectDeadline, javadoc projectLeader, double budget) {
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
        this.projectLeader = projectLeader;
        this.budget = budget;
    }

    /**
     * Prints the details of the project.
     */
    public void printProjectDetails() {
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Deadline: " + projectDeadline);
        System.out.println("Budget: " + budget);
        projectLeader.printDetails();
    }

    /**
     * Updates the budget for the project.
     *
     * @param newBudget  The new budget for the project.
     */
    public void updateBudget(double newBudget) {
        budget = newBudget;
        System.out.println("Budget updated to: " + budget);
    }
}

/**
 * Represents a client of the company.
 */
class representclient {
    /**
     * The name of the client.
     */
    public String clientName;

    /**
     * The email of the client.
     */
    public String clientEmail;

    /**
     * The project associated with the client.
     */
    public dokumentasi project;

    /**
     * Constructs a Client object with the given name, email, and project.
     *
     * @param clientName  The name of the client.
     * @param clientEmail  The email of the client.
     * @param project     The project associated with the client.
     */
    public representclient(String clientName, String clientEmail, dokumentasi project) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.project = project;
    }

    /**
     * Prints the details of the client.
     */
    public void printClientDetails() {
        System.out.println("Client Name: " + clientName);
        System.out.println("Client Email: " + clientEmail);
        project.printProjectDetails();
    }
}

/**
 * The main class to run the application.
 */
class utama {
    /**
     * The main method to execute the application.
     *
     * @param args  The command line arguments.
     */
    public static void main(String[] args) {
        javadoc emp = new javadoc("John Doe", 12345, 75000, "Engineering");
        Manager manager = new Manager("Jane Smith", 67890, 100000, "Management");
        dokumentasi proj = new dokumentasi("AI Development", "2024-12-31", manager, 1000000);
        representclient client = new representclient("Acme Corp", "contact@acme.com", proj);

        client.printClientDetails();
        emp.applyBonus();
        manager.applyBonus();
        emp.updateDepartment("Research and Development");
        proj.updateBudget(1200000);
    }
}