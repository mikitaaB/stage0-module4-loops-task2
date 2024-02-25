package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int fact = 1;
        if (printToInclusive == 0) {
            System.out.println(1);
        } else {
            while (counter<=printToInclusive) {
                fact = fact * counter;
                System.out.println(fact);
                counter++;
            }
        }
    }
}
