package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;

        while (number <= printToInclusive) {
            int divider = 2;
            while (divider <= number){
                if (number == divider){
                    System.out.println(number);
                }
                if (number % divider == 0){
                    break;
                }
                divider++;
            }
            number++;
        }
    }
}
