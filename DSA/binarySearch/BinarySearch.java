package binarySearch;

public class BinarySearch {

	static int binarySearch(int arr[],int target )
	{
		int start=0;
		int end=arr.length-1;
		
		
		while(start<=end)
		{
//			int mid=(start+end)/2; might be possible that (start+end)exceeds the range of int in java
			int mid=start+(end-start)/2;
			
			if(target>arr[mid])
			{
				start=mid+1;
			}else if(target<arr[mid])
			{
				end=mid-1;
			}else 
			{
				return mid;
			}
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		
      int arr[]= {2,6,8,12,16,20,25,30,36,48};
   
      int target=16;
      int ans=BinarySearch.binarySearch(arr, 25);
      System.out.println(ans);
	}

}
