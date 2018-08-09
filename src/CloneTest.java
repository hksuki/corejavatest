import java.util.*;

public class CloneTest {
    public static void main(String[] args)
    {
        try {
            Employee original = new Employee("John", 90000, 2008, 8, 2);
            Employee copy = original.clone();
            copy.raiseSalary(5);
            System.out.println(original.toString());
            System.out.println(copy.toString());
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
