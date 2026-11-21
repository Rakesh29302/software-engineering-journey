import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] pages = {12,34,67,90};
        int students = 2;
		Main res = new Main();
		
		int result = res.AllocateBooks(pages, students);
		System.out.println(result);
		
	}
	
	public int AllocateBooks(int[] pages, int students){
	    int low=Arrays.stream(pages).max().getAsInt();
	    int high= Arrays.stream(pages).sum();
	    int answer=-1;
	    if (students > pages.length) {
            return -1;
        }
	    while(low<=high){
	        int mid= low+(high-low)/2;
	        boolean allocate =canAllocate(pages,students, mid);
	        if(allocate==true){
	            high=mid-1;
	            answer=mid;
	        }
	        else{
	            low=mid+1;
	        }
	        
	    }
	    return answer;
	}
	
	public boolean canAllocate(int[] pages, int students, int maxPages) {

    
    int studentsused = 1;
    int currentpages = pages[0];

    for(int i=1;i<pages.length;i++){
        if((pages[i]+currentpages)<=maxPages){
            currentpages= currentpages+ pages[i];
        }
        else
        {
            studentsused++;
            currentpages = pages[i];
        }
        
    }
    return studentsused <= students;
}
}