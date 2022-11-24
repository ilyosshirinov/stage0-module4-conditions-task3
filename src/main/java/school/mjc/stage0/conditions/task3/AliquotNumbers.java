package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        int sum = 0;
        for (int i = 1; i <= first / 2; i++) {
            if (first % 2 == 0) {
                sum += i;
            }
        }
        if (sum != first) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }

    public static void main(String[] args) {
        AliquotNumbers numbers = new AliquotNumbers();
        numbers.isFirstAliquot(6, 10);
    }
}