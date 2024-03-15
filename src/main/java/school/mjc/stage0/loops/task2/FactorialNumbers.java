package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0;
        while (number <= printToInclusive) {
            long factorial = calculateFactorial(number);
            System.out.println(factorial);
            number++;
        }
    }

    private long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
