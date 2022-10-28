package sortingprb;
import java.util.*;


//Java Program to sort an elements
//by bringing Arrays into play

//Main class
public class sortingUsingloops {

	// Main driver method
	public static void main(String[] args)
	{
//		int arr[]= {4,3,6,7,1,2};
		Scanner sc=new Scanner(System.in);

		// Custom input array
		int arr[] = new int[100];
		int N;
		
		//num of elements
		N = sc.nextInt();
		
		for(int k =0 ; k<N;k++) {
			arr[k]=sc.nextInt();
		}
		

		// Outer loop
		for (int i = 0; i < N; i++) {

			// Inner nested loop pointing 1 index ahead
			for (int j = i + 1; j < N; j++) {

				// Checking elements
				int temp = 0;
				if (arr[j] < arr[i]) {

					// Swapping
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
//					System.out.print(arr[i] + " ");
				}
			}			
		}
		System.out.println("Sorted");
		for(int h=0; h<N;h++) {
			// Printing sorted array elements
						System.out.print(arr[h] + " ");
		}
	}
}
