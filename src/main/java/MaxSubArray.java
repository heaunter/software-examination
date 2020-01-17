
public class MaxSubArray {

    public static void main(String[] args) {
        int[] input = {1, 2};
        MaxSubArray array = new MaxSubArray();
        int output = array.maxSubArray(input);
        System.out.println(output);
    }

    public int maxSubArray(int[] nums) {
        int sum = nums[0];

        int i = 0;
        while (i < nums.length) {
            int tem = 0;
            tem += nums[i];
            if (tem > sum) {
                sum = tem;
            }
            i++;
        }
        return sum;
    }

}
