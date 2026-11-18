
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] nums = {1, 3, 5, 6};
                int target = 7;
		Main res = new Main();
		int result = res.SearchInsertPosition(nums, target);
		System.out.println(result);
		
	}
	
	public int lowerBound(int[]nums, int target){
	    int left=0;
	    int right=nums.length;
	    
	    
	    while(left<right){
	     int mid=left+(right-left)/2;
	    if(nums[mid]<target){
	        left=mid+1;
	    }
	    else{
	        right=mid;
	    }
	    }
	    return left;
	}

	
	public int SearchInsertPosition(int[] nums, int target) {
    return lowerBound(nums, target);
}
}