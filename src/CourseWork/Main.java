package CourseWork;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[15];

        Employee employee1 = new Employee("Пушкин Александр Сергеевич", 1, 55_000);
        employees[0] = employee1;

        Employee employee2 = new Employee("Лермонтов Михаил Юрьевич", 2, 55_000);
        employees[1] = employee2;

        Employee employee3 = new Employee("Достоевский Федор Михайлович", 2, 70_000);
        employees[2] = employee3;

        Employee employee4 = new Employee("Тургенев Иван Сергеевич", 2, 60_000);
        employees[3] = employee4;

        Employee employee5 = new Employee("Гончаров Иван Александрович", 1, 44_000);
        employees[4] = employee5;

        Employee employee6 = new Employee("Гоголь Николай Васильевич", 3, 88_000);
        employees[5] = employee6;

        Employee employee7 = new Employee("Островский Александр Николаевич", 3, 48_000);
        employees[6] = employee7;

        Employee employee8 = new Employee("Грибоедов Александр Сергеевич", 4, 90_000);
        employees[7] = employee8;

        Employee employee9 = new Employee("Чехов Антон Павлович", 4, 87_000);
        employees[8] = employee9;

        Employee employee10 = new Employee("Булгаков Михаил Афанасьевич", 5, 65_000);
        employees[9] = employee10;

        Employee employee11 = new Employee("Некрасов Николай Алексеевич", 5, 44_000);
        employees[10] = employee11;

        Employee employee12 = new Employee("Толстой Лев Николаевич", 5, 70_000);
        employees[11] = employee12;

        Employee employee13 = new Employee("Есенин Сергей Александрович", 1, 45_000);
        employees[12] = employee13;

        Employee employee14 = new Employee("Маяковский Владимир Владимирович", 3, 53_000);
        employees[13] = employee14;

        Employee employee15 = new Employee("Ахматова Анна Андреевна", 5, 63_000);
        employees[14] = employee15;

        insertSeparator();
        System.out.println("Книга сотрудников");
        insertSeparator();
        printAllEmployees(employees);
        insertSeparator();
        int totalSalaryForMonth = calculateTotalExpensesForSalary(employees);
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + totalSalaryForMonth + " руб.");
        insertSeparator();
        int minSalary = findMinimumSalary(employees);
        printEmployeeWithMinimumSalary(employees, minSalary);
        insertSeparator();
        int maxSalary = findMaximumSalary(employees);
        printEmployeeWithMaximumSalary(employees, maxSalary);
        insertSeparator();
        int averageSalary = calculateAverageSalaryPerMonth(employees);
        System.out.println("Среднее значение зарплат составляет " + averageSalary + " руб.");
        insertSeparator();
        printAllFullNames(employees);
    }

    public static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public static int calculateTotalExpensesForSalary(Employee[] employees) {
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }

    public static int findMinimumSalary(Employee[] employees) {
        int minSalary = 100_000;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public static void printEmployeeWithMinimumSalary(Employee[] employees, int minSalary) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() == minSalary) {
                System.out.println("Сотрудник(-и) с минимальной зарплатой:\n" + employee);
            }
        }
    }

    public static int findMaximumSalary(Employee[] employees) {
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public static void printEmployeeWithMaximumSalary(Employee[] employees, int maxSalary) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() == maxSalary) {
                System.out.println("Сотрудник(-и) с максимальной зарплатой:\n" + employee);
            }
        }
    }

    public static int calculateAverageSalaryPerMonth(Employee[] employee) {
        int totalSalary = calculateTotalExpensesForSalary(employee);
        int averageSalary = totalSalary / employee.length;
        return averageSalary;
    }

    public static void printAllFullNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            String fullName = employee.getFullName();
            System.out.println(fullName);
        }
    }

    public static void insertSeparator() {
        System.out.println("==========================================================================================");
    }
}
