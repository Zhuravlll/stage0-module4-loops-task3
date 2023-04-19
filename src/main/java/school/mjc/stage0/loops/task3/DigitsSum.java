package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String a = "a" + t;
        int k = a.length();
        int temp = 0;
        int result = 0;
        for (int i = 0; (i <= k - 1); i++) {
            temp = (t % 10);
            result += temp;
            t /= 10;
        }
        System.out.println(Math.abs(result));
    }
}
