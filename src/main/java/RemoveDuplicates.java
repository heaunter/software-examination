public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] input = {1, 1, 2, 3, 4, 4, 5};
        RemoveDuplicates duplicates = new RemoveDuplicates();
        int out = duplicates.removeDuplicates(input);
        System.out.println(out);
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
