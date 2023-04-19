package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        int temp = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            temp = (int) (Math.pow(10, i) - Math.pow(1, i - 1));
            result += temp;
        }
        System.out.println(result);
    }
}
