public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee (String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        //1
        Employee employee = new Employee("Петр Соклоков", "SDET", "PSESoklokov@sebr.ru", "+79667778918", 350000, 39);
        employee.printInfo();
        //2
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иван Иванович Иванов", "Инженер", "ivan@example.com", "+123456789", 300000, 35);
        employees[1] = new Employee("Петр Петрович Петров", "Программист", "petr@example.com", "+987654321", 350000, 28);
        employees[2] = new Employee("Анна Сидоровна Сидорова", "Дизайнер", "anna@example.com", "+111222333", 150000, 30);
        employees[3] = new Employee("Сергей Сергеевич Сергеев", "Менеджер", "sergey@example.com", "+777888999", 200000, 32);
        employees[4] = new Employee("Ольга Олеговна Олегова", "Бухгалтер", "olga@example.com", "+444555666", 100000, 29);

        for (int i = 0; i < employees.length; ++i) {
            employees[i].printInfo();
        }
    }
}
