import java.util.Scanner;
//create interface taxable
interface Taxable
{
    double SaleTax=0.07;
    double IncomeTax=0.105;
    double calTax();
}
//create employee class
class Employee implements Taxable
{
    int eId;
    String name;
    double salary;
    Employee(int employeeId,String name,double salary)
    {
        this.eId=employeeId;
        this.name=name;
        this.salary=salary;
    }
    public String toString() {
        return "Employee ID: " + eId + ", name: " + name + ",salary: " + salary;
    }
//calculate incometax
    public double calTax() {
        return salary * IncomeTax;
    }
}
//create product class
class Product implements Taxable {
    int pid;
    double price;
    int quantity;
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString() {
        return "Product ID: " + pid + ", Price: " + price + ", Quantity: " + quantity;
    }

    //calculate saletax
    public double calTax() {
        return price * quantity * SaleTax;
    }
}

public  class Main {
    public static void main(String[] args)
    {
     
            Scanner scanner = new Scanner(System.in);
       //accept employee information from user
            System.out.println("Enter details for Employee :");
            System.out.print("Employee ID: ");
            int eId = scanner.nextInt();
            System.out.print("name: ");
            String name = scanner.next();
            System.out.print("salary: ");
            double salary = scanner.nextDouble();
        //create employee object
            Employee employee = new Employee(eId,name,salary);
         //print incometax   
            double incomeTax=employee.calTax();
            System.out.println("income Tax: " + incomeTax);
        //accept product information from user   
            System.out.println("Enter details for Product :");
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
         //create product object
             Product products = new Product(pid,price,quantity);
         //print salestax
            double salesTax=products.calTax();
            System.out.println("Sales Tax: " + salesTax);


    }
}