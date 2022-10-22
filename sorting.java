public class binarysearch {

    // Time complexity: O(N) and auxillaryspace: O(1)
    public static void binarysearch(int[] arr, int l, int r, int k) {
        int mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (arr[mid] == k) {
                System.out.println("element found " + arr[mid]);
                break;
            } 
            if (k < arr[mid]) {
                r = mid - 1;
            } else if(k>arr[mid]){
                l = mid + 1;
            }

        }
        System.out.println(arr[mid]);

    }



    public static void main(String[] args) {
        int[] arr = { 5, 9, 17, 23, 25, 45, 59, 63, 71, 89 };
        binarysearch(arr, 0, arr.length - 1, 59);
    }
}
