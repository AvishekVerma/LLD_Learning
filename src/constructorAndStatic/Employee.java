package constructorAndStatic;

public class Employee {

    String name;
    int salary;

//    public Employee(){
//
//    }

    public Employee(){
        name = "Rahul";
        salary = 100000;
    }

    public Employee(String employeeName, int employeeSalary){
        name = employeeName;
        salary = employeeSalary;
    }

    public Employee(String employeeName){
        name = employeeName;
    }
}
