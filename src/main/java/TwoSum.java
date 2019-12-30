public class TwoSum {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 4, 7, 8, 9};
        int target = 15;

        TwoSum main = new TwoSum();
        int[] ints = main.twoSum(nums, target);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
        System.out.println();
    }

    /**
     * 两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
