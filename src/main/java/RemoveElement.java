public class RemoveElement {

    public static void main(String[] args) {

        int[] input = {2, 3, 4, 5, 12, 3, 5, 8};
        int val = 5;
        RemoveElement removeElement = new RemoveElement();
        int output = removeElement.removeElement(input, val);
        System.out.println(output);
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public int removeElement1(int[] nums, int val) {
        if (nums.length <= 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
