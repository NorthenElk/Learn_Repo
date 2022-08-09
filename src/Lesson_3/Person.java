package Lesson_3;

public class Person {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Egor Klimov", "Engineer", "Kegor@mail.ru", "89275237423",200000, 21);
        empCorp[1] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empCorp[2] = new Employee("Paul McCartney","Singer", "PMcCartney@gmail.com", "111111111", 10000000, 80);
        empCorp[3] = new Employee("Grygory Popov", "Locksmith", "GryPo@list.ru", "71734", 15000, 45);
        empCorp[4] = new Employee("Vladymyr Sydorenko", "Business Analyst", "VladBA@list.ru", "89348764518", 300000, 26);
        for (Employee employee : empCorp)
            if (employee.getAge()>40){
                System.out.println(employee);
            }
    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}