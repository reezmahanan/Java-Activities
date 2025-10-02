abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();
}

interface Department {
    void getDepartmentName();
}

class Manager extends Employee implements Department {
    double basicSalary;

    Manager(String name, double basicSalary) {
        super(name);
        this.basicSalary = basicSalary;
    }

    @Override
    void calculateSalary() {
        double salary = basicSalary + 5000; 
        System.out.println("Manager " + name + " salary: " + salary);
    }

    @Override
    public void getDepartmentName() {
        System.out.println("Department: Management");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Manager m = new Manager("Reezma", 40000);
        m.getDepartmentName();
        m.calculateSalary();
    }
}