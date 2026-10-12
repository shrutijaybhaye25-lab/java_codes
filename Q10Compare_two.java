class CompEmployee {
    String name;
    double salary;

    CompEmployee(String name, double monthlySalary) {
        this.name = name;
        this.salary = monthlySalary * 12;
    }

    void compareTo(CompEmployee other) {
        if (this.salary > other.salary) System.out.println(this.name + " earns more than " + other.name + ".");
        else if (this.salary < other.salary) System.out.println(other.name + " earns more than " + this.name + ".");
        else System.out.println(this.name + " and " + other.name + " have equal salaries.");
    }
}

public class Q10Compare_two {
    public static void main(String[] args) {
        CompEmployee e1 = new CompEmployee("Rahul", 40000);
        CompEmployee e2 = new CompEmployee("Amit", 50000);
        CompEmployee e3 = new CompEmployee("Priya", 50000);

        e1.compareTo(e2);
        e2.compareTo(e3);
        System.out.println("Highest-paid employee: Amit");
        System.out.println("Annual Salary: " + e2.salary);
    }
}