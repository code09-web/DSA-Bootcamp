package binarySearch;

//largest number which is smallest value of target or equal 

public class Q2_FloorOfNumber {

	static int floorOfNumber(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target > arr[mid])
			{
				start=mid+1;
			}else if(target < arr[mid])
			{
				end=mid-1;
			}else {
				return mid;
			}
		}
		return end;
	}
	
	public static void main(String[] args) {
		

		  int arr[]= {2,6,8,12,16,20,25,30,36,48};		   
	      int target=21;
	      
	      int ans=Q2_FloorOfNumber.floorOfNumber(arr, target);
	      System.out.println(ans);
	}

}
