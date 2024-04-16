package InterviewPractise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortingzon2Cond {
    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee(1, "Rahul", LocalDate.of(2020, 1, 31)));
        listEmp.add(new Employee(2, "Kul1", LocalDate.of(2020, 1, 31)));
        listEmp.add(new Employee(3, "Kul", LocalDate.of(2021, 1, 31)));
        listEmp.add(new Employee(4, "Rahul", LocalDate.of(2021, 1, 31)));
        listEmp.add(new Employee(5, "Riyaz", LocalDate.of(2027, 6, 18)));
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getDoj).thenComparing(Employee::getEmpname).reversed();

        listEmp.stream().sorted(employeeComparator).forEach(e-> System.out.println(e));
        Collections.sort(listEmp, employeeComparator);
        System.out.println(listEmp);
        Comparator comp = Comparator.comparing(Employee::getEmpid).thenComparing(Employee::getEmpname);
        System.out.println(comp);
    }
}
