import java.util.*;

public class WorkTest {
    public static void main(String[] args)
    {
        WorkerInterface work = new WorkerInterface() {
            @Override
            public void doWork() {
                System.out.println("通过匿名函数调用");
            }
        };

        work.doWork();

        work = () -> System.out.println("通过Lambda表达式调用");
        work.doWork();
    }
}

@FunctionalInterface
interface WorkerInterface {
    public void doWork();
}
