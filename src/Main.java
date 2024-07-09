public class Main {
    public static void main(String[] args) {
        final Employee[] employees = new Employee[10];
        for (int i = 1, j = 1; i <= 10; i++) {
            float baseSalary = 1000.5f;
            Employee employee = new Employee("Name" + i, "Surname" + i, "SecondName" + i, j, baseSalary * j * i);
            j++;
            if (j == 6) {
                j = 1;
            }
            employees[i - 1] = employee;
        }
//        printAllEmployees(employees);
//        System.out.println(calculateMonthSalaryForAllEmployees(employees));
//        System.out.println(findEmployeeWithMinSalary(employees));
//        System.out.println(findEmployeeWithMaxSalary(employees));
//        System.out.println(calculateMediumSalary(employees));
//        printAllEmployeesFio(employees);
//        indexSalary(employees, 10.0f);
//        System.out.println(findEmployeeWithMinSalaryByDepartment(employees, 5));
//        System.out.println(findEmployeeWithMaxSalaryByDepartment(employees, 5));
//        System.out.println(calculateMonthSalaryForDepartment(employees, 5));
//        System.out.println(calculateMediumSalaryByDepartment(employees, 5));
//        indexSalaryByDepartment(employees, 10.0f, 5);
//        printEmployeesByDepartment(employees, 5);
//        printEmployeesWithLessSalary(employees, 2000);
//        printEmployeesWithMaxSalary(employees, 2000);
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

    public static void indexSalary(Employee[] employees, float percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                float currentSalary = employee.getSalary();
                employee.setSalary(currentSalary + (currentSalary * percent) / 100);
            }
        }
    }

    public static Employee findEmployeeWithMinSalaryByDepartment(Employee[] employees, int department) {
        Employee employeeWithMinSalary = null;
        float minSalary = -1.0f;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                float currentSalary = employee.getSalary();
                if (minSalary < 0 || minSalary > 0 && minSalary > currentSalary) {
                    minSalary = currentSalary;
                    employeeWithMinSalary = employee;
                }
            }
        }

        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalaryByDepartment(Employee[] employees, int department) {
        Employee employeeWithMaxSalary = null;
        float maxSalary = -1.0f;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                float currentSalary = employee.getSalary();
                if (maxSalary < 0 || maxSalary > 0 && maxSalary < currentSalary) {
                    maxSalary = currentSalary;
                    employeeWithMaxSalary = employee;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public static float calculateMonthSalaryForDepartment(Employee[] employees, int department) {
        float monthSalary = 0f;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                monthSalary += employee.getSalary();
            }
        }

        return monthSalary;
    }

    public static float calculateMediumSalaryByDepartment(Employee[] employees, int department) {
        int employeesAmount = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employeesAmount++;
            }
        }

        if (employeesAmount == 0) {
            return employeesAmount;
        }

        return calculateMonthSalaryForDepartment(employees, department) / employeesAmount;
    }

    public static void indexSalaryByDepartment(Employee[] employees, float percent, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                float currentSalary = employee.getSalary();
                employee.setSalary(currentSalary + (currentSalary * percent) / 100);
            }
        }
    }

    public static void printEmployeesByDepartment(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("Employee{" +
                        "name='" + employee.getName() + '\'' +
                        ", surname='" + employee.getSurname() + '\'' +
                        ", secondName='" + employee.getSecondName() + '\'' +
                        ", salary=" + employee.getSalary() +
                        ", id=" + employee.getId() +
                        "}");
            }
        }
    }

    public static void printEmployeesWithLessSalary(Employee[] employees, float salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("Employee{" +
                        "name='" + employee.getName() + '\'' +
                        ", surname='" + employee.getSurname() + '\'' +
                        ", secondName='" + employee.getSecondName() + '\'' +
                        ", salary=" + employee.getSalary() +
                        ", id=" + employee.getId() +
                        "}");
            }
        }
    }

    public static void printEmployeesWithMaxSalary(Employee[] employees, float salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salary) {
                System.out.println("Employee{" +
                        "name='" + employee.getName() + '\'' +
                        ", surname='" + employee.getSurname() + '\'' +
                        ", secondName='" + employee.getSecondName() + '\'' +
                        ", salary=" + employee.getSalary() +
                        ", id=" + employee.getId() +
                        "}");
            }
        }
    }
}
