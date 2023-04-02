import java.util.Scanner;

public class Employee {
    double eno, age, basic, net;
    String ename;
    void accept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee number-");
        eno = in.nextDouble();
        System.out.println("Enter employee name-");
        ename = in.next();
        System.out.println("Enter employee age-");
        age = in.nextDouble();
        System.out.println("Enter employee basic-");
        basic = in.nextDouble();
    }
    void calculate(){
        double hra = (18.5*basic)/100, da = (17.45*basic)/100, pf = (8.10*basic)/100;
        net = basic + hra + da - pf;
        if(age>50)
            net = net + 5000.0;
    }
    void print(){
        System.out.println("Employee's no: " + eno);
        System.out.println("Employee's name: " + ename);
        System.out.println("Employee's age: " + age);
        System.out.println("Employee's basic: " + basic);
        System.out.println("Employee's net salary: " + net);
    }
    public static void main(String[] args) {
        Employee ob = new Employee();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
