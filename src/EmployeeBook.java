public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public Employee removeEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return employees[i];
            }
        }

        return null;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public float calculateMonthSalaryForAllEmployees() {
        float monthSalary = 0f;
        for (Employee employee : employees) {
            if (employee != null) {
                monthSalary += employee.getSalary();
            }
        }

        return monthSalary;
    }

    public Employee findEmployeeWithMinSalary() {
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

    public Employee findEmployeeWithMaxSalary() {
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

    public float calculateMediumSalary() {
        int employeesAmount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeesAmount++;
            }
        }

        if (employeesAmount == 0) {
            return employeesAmount;
        }

        return calculateMonthSalaryForAllEmployees() / employeesAmount;
    }

    public void printAllEmployeesFio() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getSecondName());
            }
        }
    }

    public void indexSalary(float percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                float currentSalary = employee.getSalary();
                employee.setSalary(currentSalary + (currentSalary * percent) / 100);
            }
        }
    }

    public Employee findEmployeeWithMinSalaryByDepartment(int department) {
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

    public Employee findEmployeeWithMaxSalaryByDepartment(int department) {
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

    public float calculateMonthSalaryForDepartment(int department) {
        float monthSalary = 0f;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                monthSalary += employee.getSalary();
            }
        }

        return monthSalary;
    }

    public float calculateMediumSalaryByDepartment(int department) {
        int employeesAmount = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employeesAmount++;
            }
        }

        if (employeesAmount == 0) {
            return employeesAmount;
        }

        return calculateMonthSalaryForDepartment(department) / employeesAmount;
    }

    public void indexSalaryByDepartment(float percent, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                float currentSalary = employee.getSalary();
                employee.setSalary(currentSalary + (currentSalary * percent) / 100);
            }
        }
    }

    public void printEmployeesByDepartment(int department) {
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

    public void printEmployeesWithLessSalary(float salary) {
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

    public void printEmployeesWithMaxSalary(float salary) {
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
