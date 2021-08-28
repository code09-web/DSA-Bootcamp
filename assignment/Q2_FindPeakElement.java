package binarySearch;

public class Q2_FindPeakElement {

	 public int findPeakElement(int[] nums) {
	        
		 int start=0, end=nums.length-1;
		 
		 if(nums.length<2)
		 {
			 return nums.length-1;
		 }
		 
		 if(nums[0]>nums[1])
		 {
			 return nums[0];
		 }else if(nums[end]>nums[end-1]) {
			 return nums[end];
		 }
		 
		 while(start<=end)
		 {
			 int mid=start+(end-start)/2;
			 
			 if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
			 {
				 return mid;
			 }
			 
			 if(nums[mid]<nums[mid+1])
			 {
				 start=mid+1;
			 }else if(nums[mid]<nums[mid-1]){
				 end=mid-1;
			 }
			 
		 }
			return -1;  
			 
		 
	    }
	 public static void main(String[] args) {
		int nums[]= {1,2,1,3,5,6,4};
		int nums2[]= {1};
		Q2_FindPeakElement obj=new Q2_FindPeakElement();
		int ans=obj.findPeakElement(nums2);
		System.out.println(ans);
		
	}
}
