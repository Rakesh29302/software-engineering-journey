import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] stalls = {1, 7, 4, 8,2};
        int cows = 3;
		Main res = new Main();
		
		int result = res.aggressivecows(stalls, cows);
		System.out.println(result);
		
	}
	
	public int aggressivecows(int[] stalls, int cows){
	    Arrays.sort(stalls);
	    int low=1;
	    int high= stalls[stalls.length-1]-stalls[0];
	    int answer=-1;
	    while(low<=high){
	        int mid= low+(high-low)/2;
	        boolean canplace =canPlaceCows(stalls,cows, mid);
	        if(canplace==true){
	            low=mid+1;
	            answer=mid;
	        }
	        else{
	            high=mid-1;
	        }
	        
	    }
	    return answer;
	}
	
	public boolean canPlaceCows(int[] stalls, int cows, int distance) {

    // Place first cow
    int lastPlaced = stalls[0];
    int cowsPlaced = 1;

    // Iterate through remaining stalls
    for(int i=1;i<stalls.length;i++){
        if((stalls[i]-lastPlaced)>=distance){
            lastPlaced=stalls[i];
            cowsPlaced++;
        }
        
    }
    return cowsPlaced>=cows;
    // Check whether all cows were placed
}
}