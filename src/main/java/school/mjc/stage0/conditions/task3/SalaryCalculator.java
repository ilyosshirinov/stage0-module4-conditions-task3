package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 1000) {
            System.out.println(salary - salary * 0.15);
        } else if (salary <= 2000) {
            System.out.println(salary - salary * 0.18);
        } else {
            System.out.println(salary - salary * 0.2);
        }
    }

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();
        calculator.calculateSalary(2000);
    }
}