class Employee
    static int ID;
}
public class Main{
    public static void main(String [] args)
    {
    Employee e1 = new Employee();
    Employee e2 = new Employee();
    Employee e3 = new Employee();
    Employee e4 = new Employee();
    Employee e5 = new Employee();
    e1.ID = 1;
    e1.ID = 2; 
    e1.ID = 3;
    e1.ID = 4;
    e1.ID = 5;
    Employee.ID = 7;
    System.out.println("e1's ID is:" + e1.ID);
    System.out.println("e1's ID is:" + e2.ID);
    System.out.println("e1's ID is:" + e3.ID);
    System.out.println("e1's ID is:" + e4.ID);
    System.out.println("e1's ID is:" + e5.ID);
   }
}