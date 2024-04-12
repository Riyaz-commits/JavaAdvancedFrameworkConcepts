package InterviewPractise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee(1, "Rahul", LocalDate.of(2020, 1, 31)));
        listEmp.add(new Employee(2, "Kul1", LocalDate.of(2020, 1, 31)));
        listEmp.add(new Employee(3, "Kul", LocalDate.of(2021, 1, 31)));
        listEmp.add(new Employee(4, "Rahul", LocalDate.of(2021, 1, 31)));
        listEmp.add(new Employee(1, "zion", LocalDate.of(2020, 1, 31)));
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getDoj).
                thenComparing(Employee::getEmpname, (e1, e2) ->
                e2.compareTo(e1));

        listEmp.stream().sorted(employeeComparator).forEach(e -> System.out.println(e));
        Collections.sort(listEmp, employeeComparator);
        System.out.println(listEmp);

        Comparator<Employee> comp = (e1, e2) -> {

            if (e1.empid > e2.empid) {
                return -1;
            } else if (e1.empid < e2.empid) {
                return +1;
            } else {
                return 1;
            }
        };

        listEmp.stream().sorted(comp).forEach(e -> System.out.println("New Sort " + e));
    }
}
