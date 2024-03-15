package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        if (multiplyByAndToInclusive > 0) {
            while (counter <= multiplyByAndToInclusive) {
                int multiplied = counter * multiplyByAndToInclusive;
                System.out.println(multiplied);
                counter++;
            }
        } else {
            while (counter >= multiplyByAndToInclusive) {
                int multiplied = counter * multiplyByAndToInclusive;
                System.out.println(multiplied);
                counter--;
            }
        }
    }
}
