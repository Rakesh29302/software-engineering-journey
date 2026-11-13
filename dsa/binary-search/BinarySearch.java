public class BinarySearch {

    // Standard Binary Search
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // Lower Bound: First index where nums[i] >= target
    public int lowerBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    // Upper Bound: First index where nums[i] > target
    public int upperBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        int[] nums = {1, 2, 2, 2, 2, 4, 7};

        System.out.println("Search (2): " + bs.search(nums, 2));
        System.out.println("Lower Bound (2): " + bs.lowerBound(nums, 2));
        System.out.println("Upper Bound (2): " + bs.upperBound(nums, 2));

        int frequency = bs.upperBound(nums, 2) - bs.lowerBound(nums, 2);
        System.out.println("Frequency (2): " + frequency);
    }
}
