Node mergeKList(Node[]arr,int K)

    {

        if(arr.length==0) return null;

       return partation(arr,0,arr.length-1); 

    }

    Node partation(Node []arr,int start,int end){

        if(start==end) {

        return arr[start];

    }

    int mid=(start+end)/2;

    Node l1=partation(arr,start,mid);

    Node l2=partation(arr,mid+1,end);

    return merge(l1,l2);

   }

   

   Node merge(Node l1, Node l2){

       if(l1==null) return l2;

       if(l2==null) return l1;

       

       if(l1.data<l2.data){

           l1.next=merge(l1.next,l2);

           return l1;

       }

       else{

           l2.next=merge(l1,l2.next);

           return l2;

       }

   }
