public class first3largest {

    // finding a largest number using recursive function

    public static int findlargest(int[] arr, int i, int n) {
        if (i == n - 1) {
            return arr[i];
        }

        int largest = findlargest(arr, i + 1, n);

        return Math.max(arr[i], largest);
    }

    public static void firstthreelargest(int[] arr){
    int largest,secondlargest,thirdlargest;
    largest=secondlargest=thirdlargest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            thirdlargest=secondlargest;
            secondlargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondlargest){
            thirdlargest=secondlargest;
            secondlargest=arr[i];
        }
        else if(arr[i]>thirdlargest){
            thirdlargest=arr[i];
        }
    }    
System.out.println(" "+largest+" "+secondlargest+" "+thirdlargest);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 3, 50, 90, 90 };
        firstthreelargest(arr);
    }

}
