import java.util.*;

public class ArrayListTest {
    public static void main(String[] args)
    {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Tom", 105000, 2009, 5, 8));
        staff.add(new Employee("Kim", 80000, 2005, 8, 9));
        staff.add(new Employee("kk", 90000, 2001, 9, 1));

        for (Employee e: staff) {
            System.out.println(e.toString());
        }
    }
}
