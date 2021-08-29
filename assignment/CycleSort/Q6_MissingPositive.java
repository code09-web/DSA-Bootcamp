package cyclicSort;

import java.util.Arrays;

public class Q6_MissingPositive {

	  public int firstMissingPositive(int[] nums) {

			int i = 0;
			while (i < nums.length) {
				int correct = nums[i]-1;
				if (0 <nums[i] && nums[i] <= nums.length&& nums[i] != nums[correct]) {
					swap(nums, i, correct);
				} else {
					i++;
				}

			}
			// search for first missing number
			for (int j = 1; j <=nums.length; j++) {
				if (j != nums[j-1]) {
					return j;
					
				}
			}
			// case2
			return nums.length+1;
		}

void swap(int[] arr, int first, int second) {
	int temp = arr[first];
	arr[first] = arr[second];
	arr[second] = temp;
}


public static void main(String[] args) {
	int[] arr = {1};

	Q6_MissingPositive obj = new Q6_MissingPositive();
	int ans = obj.firstMissingPositive(arr);
	System.out.println(Arrays.toString(arr));
	System.out.println(ans);
	
}
}

