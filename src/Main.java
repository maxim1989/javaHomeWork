public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        for (int i = 1, j = 1; i <= 10; i++) {
            float baseSalary = 1000.5f;
            Employee employee = new Employee("Name" + i, "Surname" + i, "SecondName" + i, j, baseSalary * j);
            j++;
            if (j == 6) {
                j = 1;
            }
            employees[i - 1] = employee;
        }
        printAllEmployees();
        System.out.println(calculateMonthSalaryForAllEmployees());
        System.out.println(findEmployeeWithMinSalary());
        System.out.println(findEmployeeWithMaxSalary());
        System.out.println(calculateMediumSalary());
        printAllEmployeesFio();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static float calculateMonthSalaryForAllEmployees() {
        float monthSalary = 0f;
        for (Employee employee : employees) {
            monthSalary += employee.getSalary();
        }

        return monthSalary;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        float minSalary = employeeWithMinSalary.getSalary();
        for (int i = 1; i < employees.length; i++) {
            float salary = employees[i].getSalary();
            if (minSalary > salary) {
                minSalary = salary;
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        float maxSalary = employeeWithMaxSalary.getSalary();
        for (int i = 1; i < employees.length; i++) {
            float salary = employees[i].getSalary();
            if (maxSalary < salary) {
                maxSalary = salary;
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public static float calculateMediumSalary() {
        return calculateMonthSalaryForAllEmployees() / employees.length;
    }

    public static void printAllEmployeesFio() {
        for (Employee employee : employees) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getSecondName());
        }
    }
}
