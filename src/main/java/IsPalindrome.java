public class IsPalindrome {

    public static void main(String[] args) {

        int input = 1223221;

        IsPalindrome isPalindrome = new IsPalindrome();
        boolean palindrome = isPalindrome.isPalindrome2(input);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int input) {
        if (input < 0) {
            return false;
        }
        String str = String.valueOf(input);
        return new StringBuilder(str).reverse().toString().contentEquals(str);

    }

    public boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

}
