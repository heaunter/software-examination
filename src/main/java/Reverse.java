public class Reverse {

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        int input = 1888828;
        int output = reverse.reverse2(input);
        System.out.println(output);
    }

    public int reverse2(int input) {
        long temp = 0;
        while (input != 0) {
            int pop = input % 10;
            temp = temp * 10 + pop;

            if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
                return 0;
            }
            input /= 10;
        }
        return (int) temp;
    }

    public int reverse(int input) {
        try {
            if (input < 0) {
                return -1 * Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(input))).reverse().toString());
            } else {
                return Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(input))).reverse().toString());
            }
        } catch (Exception e) {
            return 0;
        }
    }

}
