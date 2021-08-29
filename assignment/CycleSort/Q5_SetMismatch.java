package cyclicSort;
//https://leetcode.com/problems/set-mismatch/
import java.util.Arrays;
public class Q5_SetMismatch {

	public int[] findErrorNums(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int current = nums[i] - 1; // 3=2
			if (nums[current] != nums[i]) {
				swap(nums, current, i);
			} else {
				i++;
			}
		}
		for (int j = 0; j < nums.length; j++) {
			if (j + 1 != nums[j] && nums[j] == nums[nums[j] - 1]) {

				return new int[] { nums[j], j + 1 };
			}
		}
		return new int[] { -1, -1 };
	}

	void swap(int arr[], int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 1 };

		Q5_SetMismatch obj = new Q5_SetMismatch();
		int[] ans = obj.findErrorNums(arr);
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(arr));
	}
}
