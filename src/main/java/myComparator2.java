import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class myComparator2 {
    public static void main(String[] args){
        List<Employee> eList = new ArrayList<>();
        eList.add(new Employee("Ram","mktg", 50000.10));
        eList.add(new Employee("John","pers", 10000.30));
        eList.add(new Employee("Sam","Engg", 60000.35));
        eList.add(new Employee("Ano","Engg", 70000.7));
        eList.add(new Employee("Dude","Engg", 65000.10));

        EmployeeSalaryComparator employeeSalaryComparator = new EmployeeSalaryComparator();
        Collections.sort(eList,employeeSalaryComparator);

        // Print values sorted by Salary.
        System.out.println("Sorted by Salary:");
        for(Employee e : eList) {
            System.out.println(" Row # " +  e.getName() + "|" + e.getDepartment() + "|" + e.getSalary());
        }

        EmployeeNameComparator employeeNameComparator = new EmployeeNameComparator();
        Collections.sort(eList,employeeNameComparator);

        // Print values sorted by Name.
        System.out.println("Sorted by Name:");
        for(Employee e : eList) {
            System.out.println(" Row # " +  e.getName() + "|" + e.getDepartment() + "|" + e.getSalary());
        }
    }
}
