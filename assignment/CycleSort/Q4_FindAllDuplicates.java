package cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4_FindAllDuplicates {

	public List<Integer> findDuplicates(int[] nums) {

		List<Integer> list = new ArrayList<Integer>();

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
				list.add(nums[j]);
			}
		}
		return list;

	}

	void swap(int arr[], int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

		Q4_FindAllDuplicates obj = new Q4_FindAllDuplicates();
		List<Integer> ans = obj.findDuplicates(arr);
		System.out.println(ans);
		System.out.println(Arrays.toString(arr));
	}

}
