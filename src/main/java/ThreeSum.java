import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();

        int[] param = new int[]{-3, -1, -5, 1, 3, 5, 8, 0};
        List<List<Integer>> lists = threeSum.threeSum(param);
        System.out.println(JSON.toJSONString(lists));
    }

    /**
     * 三个数字之和
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> ret = new ArrayList<List<Integer>>();
        
        return ret;
    }
}
