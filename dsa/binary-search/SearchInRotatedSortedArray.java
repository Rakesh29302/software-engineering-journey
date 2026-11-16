public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] nums={5,1,2,3,4};
		int target=4;
		Main res = new Main();
		int result = res.search(nums, target);
		System.out.println("Target found at index: " + result);
		
	}
	
	public int search(int[] nums, int target) {

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[left]<=nums[mid]) {

            if (target>=nums[left] && target<nums[mid] ) {
                // Search left
                right=mid-1;
            } else {
                // Search right
                left=mid+1;
            }

        } else {

            if (target>nums[mid] && target<=nums[right]) {
                // Search right
                left=mid+1;
            } else {
                // Search left
                right=mid-1;
            }
        }
    }

    return -1;
}
}