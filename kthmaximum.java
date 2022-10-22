import java.util.Collections;
import java.util.PriorityQueue;

public class findkthsmallesteleminmatrix {

    public static void kthsmallestmatrixelement(int[][] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (pq.size() < k) {
                    pq.add(arr[i][j]);

                }

                else if (pq.peek() > arr[i][j]) {
                    pq.poll();
                    pq.add(arr[i][j]);
                }

            }
        }
        System.out.println(k + "th smallest element in the array: " + pq.peek());
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 5, 9 },
                { 10, 11, 13 },
                { 12, 13, 15 }
        };
        kthsmallestmatrixelement(arr, 8);
    }
}
