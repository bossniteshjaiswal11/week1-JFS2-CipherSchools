package demo;
public class Employee {
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }
    void display() {System.out.println(id+" "+name+" "+salary);}
    public Employee() {
    }
    public static void main(String[] args) {
        Employee E1=new Employee();
        Employee E2=new Employee();
        Employee E3=new Employee();
        E1.insert(111,"RAM",100000);
        E2.insert(112,"ARUN",100000);
        E3.insert(113,"GOVARDHAN",100000);
        E1.display();
        E2.display();
        E3.display();
    }
}
