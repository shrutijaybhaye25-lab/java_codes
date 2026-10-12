public class Q8employee_salary_cal {
    private String name;
    private int id;
    private double salary;
    private int rating;

    Q8employee_salary_cal(String n, int i, double s, int r) {
        name = n;
        id = i;
        salary = s;
        rating = r;
    }

    double salary() {
        return salary * 12;
    }

    double calculatebonus() {
        double percent = 0;

        if (rating == 5)
            percent = 20;
        else if (rating == 4)
            percent = 15;
        else if (rating == 3)
            percent = 10;
        else if (rating == 2)
            percent = 5;

        return salary() * percent / 100;
    }

    void display() {
        double annual = salary();
        double bonus = calculatebonus();

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + annual);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (annual + bonus));
    }

    public static void main(String args[]) {
        Q8employee_salary_cal e =
            new Q8employee_salary_cal("gayatri", 101, 30000, 5);
        e.display();
    }
}