public class IsPowerOfTwo {

    public static void main(String[] args) {
        IsPowerOfTwo isPowerOfTwo = new IsPowerOfTwo();
        int input = 16;
        boolean ans = isPowerOfTwo.isPowerOfTwo(input);
        System.out.println(ans);

    }

    //    解题思路：
//    若 n = 2^xn=2
//    x
//    且 xx 为自然数（即 nn 为 22 的幂），则一定满足以下条件：
//    恒有 n & (n - 1) == 0，这是因为：
//    nn 二进制最高位为 11，其余所有位为 00；
//    n - 1n−1 二进制最高位为 00，其余所有位为 11；
//    一定满足 n > 0。
//    因此，通过 n > 0 且 n & (n - 1) == 0 即可判定是否满足 n = 2^xn=2
//    x
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    /**
     * 判断入参是否为2的幂次方
     *
     * @param n 入参数字
     * @return true is yes
     */
    public boolean isPowerOfTwo1(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0 || n % 2 == 1) {
            return false;
        }
        return isPowerOfTwo1(n / 2);
    }
}
