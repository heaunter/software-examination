//0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
//
//        例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import java.util.ArrayList;
import java.util.List;

class LastRemaining {

    public static void main(String[] args) {
        LastRemaining lastRemaining = new LastRemaining();
        int i = lastRemaining.lastRemaining(10, 17);
        System.out.println(i);

    }

    public int lastRemaining(int n, int m) {
        List<Integer> values = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            values.add(i);
        }
        int index = 0;

        while (n > 1) {
            index = (index + m - 1) % n;
            values.remove(index);
            n--;
        }
        return values.get(0);
    }

}