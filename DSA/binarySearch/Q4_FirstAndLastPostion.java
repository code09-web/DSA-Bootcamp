package binarySearch;

public class Q4_FirstAndLastPostion
{

	 public static int[] searchRange(int[] nums, int target) 
	 {
		 int ans[]= {-1,-1};
		
		 ans[0]=binarySearch(nums,true,target);
		  if(ans[0]!=-1)
		 {
			  ans[1]=binarySearch(nums,false,target);
			 
		 }
			 
		
	      
		 return ans;
		 
     }
	 
	 static int binarySearch(int []nums,boolean firstPosition,int target)
	 {
		 int start=0;
		 int end=nums.length-1;
		 
		 int ans=-1;
		 while(start<=end)
		 {
			 int mid=(start+end)/2;
			 
			 if(target>nums[mid])
			 {
				 start=mid+1;
			 }else if(target<nums[mid])
			 {
				 end=mid-1;
			 }else {
				 ans=mid;
				 if(firstPosition)
				 {
					 end=mid-1;
				 }else {
					 start=mid+1;
				 }
			 }
		 }
		 return ans;
	 }
	
	public static void main(String[] args) {
	

		int arr[]= {5,7,7,8,8,10};
		int ans[]=searchRange(arr,8);
		System.out.println(ans[0]);
		
	}

}
