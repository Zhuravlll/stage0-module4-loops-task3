package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int high = 0;
        for (int i = 2; (i <= first) || (i <= second); i++) {
            if ((first % i == 0) && (second % i == 0)) {
                high = i;
            }
        }
        System.out.println(high);
    }
}
