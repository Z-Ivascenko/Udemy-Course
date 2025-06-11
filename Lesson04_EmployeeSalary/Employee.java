public class Employee {
int id;
String name;
int age;
double salary;
String department;

Employee(int id, String name, int age, double salary, String departament) {
    this.id=id;
    this.name=name;
    this.age=age;
    this.salary=salary;
    this.department=department;
}
void increaseSalary() {
    this.salary*=2;
}
void printInfo(double oldSalary) {
    System.out.println("Имя "+ name);
    System.out.println("Старая зарплата "+oldSalary);
    System.out.println("Новая зарплата "+salary);
    System.out.println();
}


}