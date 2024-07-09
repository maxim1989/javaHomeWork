public class Main {
    public static void main(String[] args) {
        final Employee[] employees = new Employee[10];
        for (int i = 1, j = 1; i <= 10; i++) {
            float baseSalary = 1000.5f;
            Employee employee = new Employee("Name" + i, "Surname" + i, "SecondName" + i, j, baseSalary * j);
            j++;
            if (j == 6) {
                j = 1;
            }
            employees[i - 1] = employee;
        }
        printAllEmployees(employees);
        System.out.println(calculateMonthSalaryForAllEmployees(employees));
        System.out.println(findEmployeeWithMinSalary(employees));
        System.out.println(findEmployeeWithMaxSalary(employees));
        System.out.println(calculateMediumSalary(employees));
        printAllEmployeesFio(employees);
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static float calculateMonthSalaryForAllEmployees(Employee[] employees) {
        float monthSalary = 0f;
        for (Employee employee : employees) {
            if (employee != null) {
                monthSalary += employee.getSalary();
            }
        }

        return monthSalary;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = null;
        float minSalary = -1.0f;

        for (Employee employee : employees) {
            if (employee != null) {
                float currentSalary = employee.getSalary();
                if (minSalary < 0 || minSalary > 0 && minSalary > currentSalary) {
                    minSalary = currentSalary;
                    employeeWithMinSalary = employee;
                }
            }
        }

        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = null;
        float maxSalary = -1.0f;
        for (Employee employee : employees) {
            if (employee != null) {
                float currentSalary = employee.getSalary();
                if (maxSalary < 0 || maxSalary > 0 && maxSalary < currentSalary) {
                    maxSalary = currentSalary;
                    employeeWithMaxSalary = employee;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public static float calculateMediumSalary(Employee[] employees) {
        int employeesAmount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeesAmount++;
            }
        }

        if (employeesAmount == 0) {
            return employeesAmount;
        }

        return calculateMonthSalaryForAllEmployees(employees) / employeesAmount;
    }

    public static void printAllEmployeesFio(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getSecondName());
            }
        }
    }
}
