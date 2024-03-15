package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power > 0) {
            int exponent = 0;
            int result = 1;

            while (exponent <= power) {
                System.out.println(result);
                result *= 2;
                exponent++;
            }
        } else {
            System.out.println("too much power");
        }
    }
}
