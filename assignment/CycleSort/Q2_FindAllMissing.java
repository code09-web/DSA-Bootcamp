package cyclicSort;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_FindAllMissing {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		sort(nums);
		List<Integer> list = new ArrayList<Integer>();

		// search  missing number
		for (int j = 0; j < nums.length; j++) {
			if (j + 1 != nums[j]) {
				list.add(j + 1);
			}
		}
		// case2
		return list;

	}

	static void sort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr.length - 1 >= arr[i] && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 2, 2 };

		Q2_FindAllMissing obj = new Q2_FindAllMissing();
		List<Integer> ans = obj.findDisappearedNumbers(arr);
		System.out.println(ans);
		System.out.println(Arrays.toString(arr));
	}

}
