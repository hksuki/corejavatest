import java.time.*;
import java.util.Objects;

public class Employee implements Comparable<Employee>, Cloneable {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public LocalDate getHireDay() {
        return this.hireDay;
    }

    public void raiseSalary(double byPercent) {
        double increase = this.salary * byPercent / 100;
        this.salary += increase;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + this.name + ", salary=" + this.salary +
                ", hireDay=" + this.hireDay + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.salary, this.hireDay);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee)obj;

        return Objects.equals(name, other.name) && this.salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    public Employee clone() throws CloneNotSupportedException
    {
        Employee cloned = (Employee)super.clone();
        cloned.hireDay = this.hireDay;
        return cloned;
    }
}
