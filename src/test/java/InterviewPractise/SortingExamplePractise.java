package InterviewPractise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExamplePractise {
    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee(1, "Rahul", LocalDate.of(2020, 1, 31)));
        listEmp.add(new Employee(2, "Kul1", LocalDate.of(2020, 1, 31)));
        listEmp.add(new Employee(3, "Kul", LocalDate.of(2021, 1, 31)));
        listEmp.add(new Employee(4, "Basha", LocalDate.of(2021, 1, 31)));
        listEmp.add(new Employee(4, "Basha", LocalDate.of(2021, 1, 30)));
        listEmp.add(new Employee(1, "zion", LocalDate.of(2020, 1, 31)));

        Comparator<Employee> comparator = (e1,e2)-> {
            if (e1.empid>e2.empid)
            {
                return -1;
            } else if (e1.empid<e2.empid) {

                return  +
                        1;
            }

            return 1;

        };
        Comparator<Employee> comparator1=(e1,e2)->
        {
            if (e1.empid<e2.empid)
            {
                return +1;
            }
            else if (e1.empid>e2.empid)
            {
                return -1;
            }
            return 1;
        };

    String max_value=   listEmp.stream().max(comparator1).toString();
        System.out.println("Maximum Value is "+max_value);

        System.out.println("max value"+   listEmp.stream().map(e->e.getEmpid()).max(Integer::compare).get());

        listEmp.stream().sorted(comparator).forEach(e-> System.out.println(e));
        System.out.println("Secong Comparator results");
        Comparator<Employee> cmp = Comparator.comparing(Employee::getEmpname).thenComparing(Employee::getDoj,
                (e1,e2)->
e1.compareTo(e2));


           /*     (e1,e2)-> {
            if (e1.getYear()<e2.getYear())
            {
                return +1;
            }
            else if (e1.getYear()>e2.getYear())
            {
                return -1;
            }
            return 1;

                });*/
        listEmp.stream().sorted(cmp).forEach(e-> System.out.println(e));
    }
}
