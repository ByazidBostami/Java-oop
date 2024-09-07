public class Employee {
    public String name;
    public double salary;
    public String designation;

    
    public void newEmployee(String name) {
        this.name = name;
        this.salary = 30000.0;
        this.designation = "junior";
    }

   
    public void promoteEmployee(String newDesignation) {
        switch (newDesignation) {
            case "senior":
                this.salary += 25000.0;
                break;
            case "lead":
                this.salary += 50000.0;
                break;
            case "manager":
                this.salary += 75000.0;
                break;
            default:
                System.out.println("Invalid designation");
                return;
        }
        this.designation = newDesignation;
        System.out.println(this.name + " has been promoted to " + newDesignation);
        System.out.printf("New Salary: %.2f Tk\n", this.salary);
    }

    
    public void calculateTax() {
        double tax;
        if (this.salary > 50000) {
            tax = this.salary * 0.30;
            System.out.printf("%s Tax Amount: %.2f Tk\n", this.name, tax);
        } else if (this.salary > 30000) {
            tax = this.salary * 0.10;
            System.out.printf("%s Tax Amount: %.2f Tk\n", this.name, tax);
        } else {
            System.out.println("No need to pay tax");
        }
    }

    
    public void displayInfo() {
        System.out.println("Employee Name: " + this.name);
        System.out.printf("Employee Salary: %.1f Tk\n", this.salary);
        System.out.println("Employee Designation: " + this.designation);
    }
}
