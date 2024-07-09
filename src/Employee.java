import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String secondName;
    private int department;
    private float salary;
    private static int idCounter = 1;
    private final int id;

    public Employee(
            String name,
            String surname,
            String secondName,
            int department,
            float salary
    ) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter;
        idCounter += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Employee.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department
                && Float.compare(salary, employee.salary) == 0
                && id == employee.id && Objects.equals(name, employee.name)
                && Objects.equals(surname, employee.surname)
                && Objects.equals(secondName, employee.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, secondName, department, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                "}";
    }
}
