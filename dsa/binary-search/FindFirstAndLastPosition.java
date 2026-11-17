import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] nums = {2, 2, 2, 2, 2};
        int target = 2;
		Main res = new Main();
		int[] result = res.searchRange(nums, target);
		System.out.println(Arrays.toString(result));
		
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
	public int upperBound(int[]nums, int target){
	    int left=0;
	    int right=nums.length;
	    
	    
	    while(left<right){
	   int mid=left+(right-left)/2;
	    if(nums[mid]<=target){
	        left=mid+1;
	    }
	    else{
	        right=mid;
	    }
	    }
	    return left;
	}
	
	public int[] searchRange(int[] nums, int target){
	    int first = lowerBound(nums, target);
	    
	    if(first==nums.length || nums[first] != target)
	    {
	        return new int[]{-1,-1};
	    }
	    else{
	        int last=upperBound(nums, target)-1;
	        return new int[]{first,last};
	    }
	    
	}
}