public class EmployeeTest {
public static void main(String[] args) {


    Employee emp1 = new Employee(1, "Ilja", 24, 1000,"IT");
    double old1 = emp1.salary;
    emp1.increaseSalary();
    emp1.printInfo(old1);

    Employee emp2 = new Employee(2, "Zasmina", 24, 1400, "IT");
    double old2 = emp1.salary;
    emp2.increaseSalary();
    emp2.printInfo(old2);


}

}
