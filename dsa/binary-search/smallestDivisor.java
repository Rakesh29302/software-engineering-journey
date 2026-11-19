import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] nums = {1, 2, 5, 9};
        int threshold = 6;
		Main res = new Main();
		int result = res.smallestDivisor(nums, threshold);
		System.out.println(result);
		
	}
	
	public int smallestDivisor(int[] nums, int threshold) {
	    int low=1;
	    int high = Arrays.stream(nums).max().getAsInt();
	    int answer=-1;
	    
	    while(low<=high){
	        long sum = 0;
	        int mid= low +(high-low)/2;
	        
	        for(int i=0;i<=nums.length-1;i++){
	            sum=sum+ (nums[i] + mid - 1)/mid;
	        }
	        if (sum <= threshold){
	            high=mid-1;
	            answer = mid;
	        }
	        else{
	            low=mid+1;
	        }
	    }
	    return answer;

}
}