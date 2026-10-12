public class Q6student_result_system {
    private String name;
    private int roll, m1, m2, m3, m4, m5;
    Q6student_result_system(String n, int r, int a, int b, int c, int d, int e) {
        name = n;
        roll = r;
        m1 = a;
        m2 = b;
        m3 = c;
        m4 = d;
        m5 = e;
    }
    void display() {
        int total = m1 + m2 + m3 + m4 + m5;

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Total: " + total + "/500");
        System.out.println("Percentage: " + total / 5.0 + "%");

        if (m1 >= 40 && m2 >= 40 && m3 >= 40 &&
            m4 >= 40 && m5 >= 40)
            System.out.println("pass");
        else
            System.out.println("fail");
    }
    public static void main(String[] args) {
        Q6student_result_system s =  new Q6student_result_system("Vikrant", 21, 68, 68, 56, 89, 57);
        s.display();
    }
}