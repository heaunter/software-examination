import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] input = {9};
        PlusOne plusOne = new PlusOne();
        int[] output = plusOne.plusOne(input);
        System.out.println(Arrays.toString(output));
    }

    public int[] plusOne(int[] digits) {

        // 特殊情况：如果个位数加1，不需要进位，直接返回
        int last = digits[digits.length - 1];
        if (last + 1 < 10) {
            digits[digits.length - 1] = last + 1;
            return digits;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
