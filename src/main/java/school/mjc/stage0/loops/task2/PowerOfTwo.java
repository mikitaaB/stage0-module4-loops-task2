package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 1;
        if (power > 0) {
            while (counter <= power) {
                counter = power * counter;
                System.out.println(counter);
            }
        } else {
            System.out.println("too much power");
        }
    }
}
