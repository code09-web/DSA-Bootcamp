package binarySearch;

public class Q1_sigleElement {

	   public static  int singleNonDuplicate(int[] nums) {
	        if(nums.length < 2) {
	        	return nums[0];
	        }
	        int start = 0, end = nums.length - 1;
	        
	        
	        //Boundary cases
	        if(end==0)
	            return nums[0];
	        else if(nums[0]!=nums[1])
	            return nums[0];
	        else if(nums[end]!=nums[end-1])
	            return nums[end];

	        while(start<=end)
	        {
	            int mid = start + (end-start)/2;
	            //Unique element condition
	            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])
	                return nums[mid];
	            
	            if(((mid%2)==0 && nums[mid]==nums[mid+1]) ||  ((mid%2)==1 && nums[mid]==nums[mid-1]))
	                start = mid+1;
	            else
	                end = mid-1;
	            
	        }
	        return -1;
	    }
	  

    public static void main(String[] args) {
		
       int arr[]= {1,1,2,3,3,4,4,8,8};
       int ans=Q1_sigleElement.singleNonDuplicate(arr);
       System.out.println(ans);
	}
}
