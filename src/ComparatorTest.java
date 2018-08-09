import java.util.*;

public class ComparatorTest {

    public static void main(String[] args)
    {
        String[] test = {"Array", "Test", "Bed"};
        Arrays.sort(test, new LengthComparator());
        for (String s: test)
            System.out.println(s);
    }
}

class LengthComparator implements Comparator<String>
{
    public int compare(String first, String second)
    {
        return first.length() - second.length();
    }
}
