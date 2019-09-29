package lambdaexpression;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 2, 1, 2, 3, 5, 4, 6, 7, 98, 6 };
		int temp;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
			}
		}
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
