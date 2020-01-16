import sun.security.timestamp.TSRequest;

public class SearchInsert {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 55, 66, 98};
        int target = 34;
        SearchInsert searchInsert = new SearchInsert();
        int out = searchInsert.searchInsert(input, target);
        System.out.println(out);
    }

    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    public int searchInsert(int[] nums, int target) {
        if (nums.length <= 0) {
            return 0;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }

    public int searchInsert1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == target || num > target) {
                return i;
            }
        }
        return nums.length;
    }
}
