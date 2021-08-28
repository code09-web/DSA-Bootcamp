package binarySearch;

public class Q3_SmallestLatter {

	  public char nextGreatestLetter(char[] letters, char target) {
	        int start=0;
	        int end=letters.length-1;
	        while(start<=end)
	        {
	        	int mid=start+(end-start)/2;
	        	if(target>letters[mid])
	        	{
	        		start=mid+1;
	        	}else if(target<letters[mid])
	        	{
	        		end=mid-1;
	        	}
	        }
	        return letters[start%letters.length];
	       
	        
	        
	    }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(1%3);
	}

}
