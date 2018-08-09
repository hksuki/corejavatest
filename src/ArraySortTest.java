import java.util.*;

public class ArraySortTest {
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tom", 105000, 2009, 5, 8);
        staff[1] = new Employee("Kim", 80000, 2005, 8, 9);
        staff[2] = new Employee("kk", 90000, 2001, 9, 1);

        Arrays.sort(staff);

        for (Employee e: staff) {
            System.out.println(e.toString());
        }
    }
}
