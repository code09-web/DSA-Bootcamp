package cyclicSort;

// https://leetcode.com/problems/missing-number/
import java.util.Arrays;

public class Q1_MissingNumber {

	public int missingNumber(int[] arr) {

		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];
			if (arr.length - 1 >= arr[i] && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}

		}
		// search for first missing number
		for (int j = 0; j < arr.length; j++) {
			if (j != arr[j]) {
				return j;
			}
		}
		// case2
		return arr.length;
	}

	void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static void main(String[] args) {

		int[] arr = {9,6,4,2,3,5,7,0,1};

		Q1_MissingNumber obj = new Q1_MissingNumber();
		int ans = obj.missingNumber(arr);
		System.out.println(ans);
		System.out.println(Arrays.toString(arr));
	}

}
