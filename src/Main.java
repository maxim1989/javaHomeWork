public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);
        for (int i = 1, j = 1; i <= 10; i++) {
            float baseSalary = 1000.5f;
            Employee employee = new Employee("Name" + i, "Surname" + i, "SecondName" + i, j, baseSalary * j * i);
            j++;
            if (j == 6) {
                j = 1;
            }
            employeeBook.addEmployee(employee);
        }
        employeeBook.printAllEmployees();
        System.out.println(employeeBook.calculateMonthSalaryForAllEmployees());
        System.out.println(employeeBook.findEmployeeWithMinSalary());
        System.out.println(employeeBook.findEmployeeWithMaxSalary());
        System.out.println(employeeBook.calculateMediumSalary());
        employeeBook.printAllEmployeesFio();
        employeeBook.indexSalary(10.0f);
        System.out.println(employeeBook.findEmployeeWithMinSalaryByDepartment(5));
        System.out.println(employeeBook.findEmployeeWithMaxSalaryByDepartment(5));
        System.out.println(employeeBook.calculateMonthSalaryForDepartment(5));
        System.out.println(employeeBook.calculateMediumSalaryByDepartment(5));
        employeeBook.indexSalaryByDepartment(10.0f, 5);
        employeeBook.printEmployeesByDepartment(5);
        employeeBook.printEmployeesWithLessSalary(2000);
        employeeBook.printEmployeesWithMaxSalary(2000);
        employeeBook.removeEmployeeById(10);
        System.out.println(employeeBook.getEmployeeById(10));
        System.out.println(employeeBook.getEmployeeById(9));
        employeeBook.printAllEmployees();
    }
}
