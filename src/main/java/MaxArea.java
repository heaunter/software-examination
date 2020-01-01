public class MaxArea {
    public static void main(String[] args) {

        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        MaxArea maxArea = new MaxArea();
        int area = maxArea.maxArea(input);
        System.out.println(area);
    }

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int tempArea = Math.min(i, j) * (j - i);
                max = Math.max(tempArea, max);
            }
        }
        return max;
    }

}
