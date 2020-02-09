import java.util.Arrays;

public class IsAnagram {
    /**
     * 字母移位
     */
    public static void main(String[] args) {
        String s = "ab", t = "a";

        IsAnagram isAnagram = new IsAnagram();
        boolean anagram = isAnagram.isAnagram(s, t);
        System.out.println(anagram);
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] charss = s.toCharArray();
        char[] charst = t.toCharArray();

        Arrays.sort(charss);
        Arrays.sort(charst);

        return Arrays.equals(charss, charst);
    }
}
