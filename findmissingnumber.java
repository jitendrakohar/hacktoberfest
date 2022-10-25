public class findmissingnumber {

    public static int findmissingnum(int[] arr) {

        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != number) {
                return number;
            }
            number++;
        }
        return -1;
    }

    // modified binary search
    // Time complexity:O(N) and auxillary space: O(1)
    public static int findmissingelement(int[] arr, int l, int r) {

        int mid = l + (r - l) / 2;
        if (l < r) {
            return r + 1;
        }
        if (arr[l] != l) {
            return l;
        }
        if (arr[mid] == mid) {
            findmissingelement(arr, mid + 1, r);
        }
        return findmissingelement(arr, l, mid);

    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 3, 4, 5, 6, 7, 10 };
        System.out.println(findmissingelement(arr, 0, arr.length - 1));

    }
}
