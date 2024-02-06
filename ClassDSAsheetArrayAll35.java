public class ClassDSAsheetArrayAll35 {
    public static void permutation(int arr[]){
        if(arr==null||arr.length <= 1) {
            return;
        }

      int i=arr.length-2;
      while(i>=0 && arr[i]>arr[i+1])i--;

      if(i>=0){
       int  j=arr.length-1;
       if(arr[j]<arr[i])j--;
       swap(arr, i, j);

      }
      reverse(arr, i+1, arr.length-1);
    }

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void reverse(int arr[],int i,int j){
        while(i<j){
            swap(arr, i++, j--);
        }
    }
    public static void buyandsell(int arr1[]){
        int bp=Integer.MAX_VALUE;
        int mp=Integer.MIN_VALUE;

        for(int i=0;i<arr1.length;i++){
            if(bp<arr1[i]){
                int profit=arr1[i]-bp;

                mp=Math.max(mp, profit);
            }else{
                bp=arr1[i];
            }
        }
        System.out.println(mp);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr1[]={7,1,5,3,6,4};
        // permutation(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        buyandsell(arr1);
        
    }
    
}
