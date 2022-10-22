import java.util.Arrays;

public class atleasttwogreater{

    public static long[] findElements( long arr[], long n)
    {
        long firstgreatest=Long.MIN_VALUE;
        long secondgreatest=Long.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>firstgreatest){
               secondgreatest=firstgreatest;
               firstgreatest=arr[i];
           }
           else if(arr[i]>secondgreatest){
               secondgreatest=arr[i];
           }
       }
       System.out.println(firstgreatest);
       System.out.println(secondgreatest);
       long[] newlist=new long[arr.length-2];
       int count=0;
       for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]);
           if(arr[i]<firstgreatest&&arr[i]<secondgreatest){
            System.out.print(arr[i]+" ");
               newlist[count]=arr[i];
               count++;
           }
       }
       return newlist;
    }







    public static void main(String[] args) {
        // 1 2 5
        long[] arr= {2, 8, 7, 1, 5};
   long [] a= findElements(arr,arr.length);
   System.out.println(Arrays.toString(a));

    }
}
