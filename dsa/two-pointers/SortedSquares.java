import java.util.Arrays;

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int index = ans.length - 1;

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[index] = nums[left] * nums[left];
                left++;
            } else {
                ans[index] = nums[right] * nums[right];
                right--;
            }

            index--;
        }

        return ans;
    }

    public static void main(String[] args) {
        SortedSquares solution = new SortedSquares();

        int[][] tests = {
            {-4, -1, 0, 3, 10},
            {-7, -3, 2, 3, 11},
            {-5, -3, -1},
            {0},
            {-2, 0, 2}
        };

        int[][] expected = {
            {0, 1, 9, 16, 100},
            {4, 9, 9, 49, 121},
            {1, 9, 25},
            {0},
            {0, 4, 4}
        };

        for (int i = 0; i < tests.length; i++) {
            int[] result = solution.sortedSquares(tests[i]);

            System.out.println("Input:    " + Arrays.toString(tests[i]));
            System.out.println("Output:   " + Arrays.toString(result));
            System.out.println("Expected: " + Arrays.toString(expected[i]));
            System.out.println(
                Arrays.equals(result, expected[i]) ? "PASS\n" : "FAIL\n"
            );
        }
    }
}
