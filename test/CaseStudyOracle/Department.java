/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaseStudyOracle;

/**
 *
 * @author mgobelli
 */
public class Department {
    private String name;    //dont know where is coming from???? maybe a name for the dept???
    public Employee[] emps = new Employee[10];
    public int lastAdded = -1;
    
    public Department(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void addEmployee(Employee employee) {
        
        if (lastAdded < emps.length) {
                
                //System.out.println(lastAdded);
                lastAdded++;

                emps[lastAdded] = employee;
                //System.out.println(employee);
        }
    }
    
    public Employee[] getEmployees() {
        // it should be lastAdded+1 but let's play with it
        
        Employee[] myEmps = new Employee[lastAdded+1];
        for (int i = 0; i < myEmps.length; i++) {
            myEmps[i] = emps[i];
            
        }
       
        return myEmps;
        
    }
    
    public int addCount() {
        
        return lastAdded+1;
        
    }
    
    public Employee getEmployeeById(int empId)  {
            Employee result = null;
       //for (int i = 0; i < emps.length; i++) {
        for (Employee myEmp: emps){
            if (myEmp != null) {
               if (myEmp.getId() == empId ) {
                    result = myEmp;
                    break;
               }
            }
            
           
       }
       return result;
    }
    
    public double getTotalSalary() {
        double totalSalary = 0.0;
        //for (Employee myEmp: emps) {
        for (int i = 0; i < lastAdded+1; i++) {
            //myEmp.getSalary();
              totalSalary += emps[i].getSalary();
        }
        return totalSalary;
    }
    // needs to be refactored but it's my code
    public double getAverageTotalSalary() {
        double totalSalary = 0.0;
        int count = 0;
        double average = 0;
        for (int i = 0; i < lastAdded+1; i++) {
        //for (Employee myEmp1: emps) {
           average = totalSalary += emps[i].getSalary();
            count++;
        }
        
        return average / count;
    }
    
    public String toString() {
        return name;
    }
}
