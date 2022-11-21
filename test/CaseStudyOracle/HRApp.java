/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaseStudyOracle;

/**
 *
 * @author mgobelli
 */
public class HRApp {
    public static void main(String[] args) {
        System.out.println("HRApp starts: ");
        
        Employee e1 = new Employee(230, "Mark" , 10000.00);
        Employee e2 = new Employee(130, "Grace" , 9000.00);
        Employee e3 = new Employee(330, "Laura" , 9000.00);
        Employee e4 = new Employee(120, "Marcelo" , 9900.00);
        Employee e5 = new Employee(125, "Amy" , 9500.00);
        
        //System.out.println("Added employee #1 and #2: " + e1 + ", " + e2);
        Department A1 = new Department("Finance");
        A1.addEmployee(e1);
        A1.addEmployee(e2);
        A1.addEmployee(e3);
        A1.addEmployee(e4);
        A1.addEmployee(e5);
        
       Employee[] emps = A1.getEmployees();
       
       for (Employee myEmp: emps) {
           System.out.println("Emps " + myEmp);
           
       }
        System.out.println("Total salaries " + A1.getTotalSalary());
        System.out.println("Average Salary " + A1.getAverageTotalSalary());
        System.out.println("Emp " + A1.getEmployeeById(330));
//        System.out.println("Emp " + e1);
//        System.out.println("Emp " + e2);
//        System.out.println("Emp " + e3);
//        System.out.println("Emp " + e4);
//        System.out.println("Emp " + e5);
        
        
        
        
        
    }
}
