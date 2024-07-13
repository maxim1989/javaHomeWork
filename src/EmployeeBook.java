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
            Employee employee = employees[i];
            if (employee != null && employee.getId() == id) {
                employees[i] = null;
                return employee;
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

    public double calculateMonthSalaryForAllEmployees() {
        double monthSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                monthSalary += employee.getSalary();
            }
        }

        return monthSalary;
    }

    public Employee findFirstEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        double minSalary = -1;

        for (Employee employee : employees) {
            if (employee != null) {
                double currentSalary = employee.getSalary();
                if (minSalary < 0 || minSalary > 0 && minSalary > currentSalary) {
                    minSalary = currentSalary;
                    employeeWithMinSalary = employee;
                }
            }
        }

        return employeeWithMinSalary;
    }

    public Employee findFirstEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        double maxSalary = -1;
        for (Employee employee : employees) {
            if (employee != null) {
                double currentSalary = employee.getSalary();
                if (maxSalary < currentSalary) {
                    maxSalary = currentSalary;
                    employeeWithMaxSalary = employee;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public double calculateMediumSalary() {
        int employeesAmount = 0;
        double monthSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeesAmount++;
                monthSalary += employee.getSalary();
            }
        }

        if (employeesAmount == 0) {
            return employeesAmount;
        }

        return monthSalary / employeesAmount;
    }

    public void printAllEmployeesFio() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getSecondName());
            }
        }
    }

    public void indexSalary(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                double currentSalary = employee.getSalary();
                employee.setSalary(currentSalary + (currentSalary * percent) / 100);
            }
        }
    }

    public Employee findFirstEmployeeWithMinSalaryByDepartment(int department) {
        Employee employeeWithMinSalary = null;
        double minSalary = -1;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double currentSalary = employee.getSalary();
                if (minSalary < 0 || minSalary > 0 && minSalary > currentSalary) {
                    minSalary = currentSalary;
                    employeeWithMinSalary = employee;
                }
            }
        }

        return employeeWithMinSalary;
    }

    public Employee findFirstEmployeeWithMaxSalaryByDepartment(int department) {
        Employee employeeWithMaxSalary = null;
        double maxSalary = -1;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double currentSalary = employee.getSalary();
                if (maxSalary < currentSalary) {
                    maxSalary = currentSalary;
                    employeeWithMaxSalary = employee;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public double calculateMonthSalaryForDepartment(int department) {
        double monthSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                monthSalary += employee.getSalary();
            }
        }

        return monthSalary;
    }

    public double calculateMediumSalaryByDepartment(int department) {
        int employeesAmount = 0;
        double monthSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                monthSalary += employee.getSalary();
                employeesAmount++;
            }
        }

        if (employeesAmount == 0) {
            return employeesAmount;
        }

        return monthSalary / employeesAmount;
    }

    public void indexSalaryByDepartment(float percent, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double currentSalary = employee.getSalary();
                employee.setSalary(currentSalary + (currentSalary * percent) / 100);
            }
        }
    }

    public void printEmployeesByDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.toStringWithoutDepartment());
            }
        }
    }

    public void printEmployeesWithLessSalary(double salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println(employee.toStringWithoutDepartment());
            }
        }
    }

    public void printEmployeesWithMaxSalary(double salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println(employee.toStringWithoutDepartment());
            }
        }
    }
}
