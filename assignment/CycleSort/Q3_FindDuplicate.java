package cyclicSort;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-duplicate-number/

public class Q3_FindDuplicate {

	  public int findDuplicate(int[] nums) {
	        
		  int i=0;
		  while(i<nums.length)
		  {
			  int current =nums[i]-1; //3=2
			  if(nums[current]!=nums[i])
			  {
				  swap(nums,current ,i);
				  
			  }else {
				  i++;
			  }
		  }
		  
		  for(int j=0; j<nums.length; j++)
		  {
			  if(j+1!=nums[j] && nums[j]==nums[nums[j]-1] )
			  {
				  return nums[j];
			  }
		  }
		  return nums.length;
		  
		  
	    }
	  void swap(int arr[],int first,int second)
	  {
		  int temp=arr[first];
		  arr[first]=arr[second];
		  arr[second]=temp;
		  
	  }
	  
	  
	  
	  
	  public static void main(String[] args) {
		  
		  int arr[]= {1,1,2};
		  Q3_FindDuplicate obj=new Q3_FindDuplicate();
		int ans=  obj.findDuplicate(arr);
		  System.out.println(Arrays.toString(arr));
		  System.out.println("ans= "+ans);
		
	}
	
}
