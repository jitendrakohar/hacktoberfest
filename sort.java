import java.util.Arrays;

class Test {
	public static void main(String args[])
	{
		int[] arr = { 89, 78, 63, 3, 15, 49, 43 };
		System.out.println("Original array");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		Arrays.sort(arr);
		System.out.println("\n Sorted array");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
