package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month <= 31) {
            System.out.println(month);
        } else {
            System.out.println("wrong number!");
        }
    }

    public static void main(String[] args) {
        DaysInMonthPrinter printer=new DaysInMonthPrinter();
        printer.amountOfDays(31);
    }
}
