public class allsorting1 {

    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
     
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }

            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        

         for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }

    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1]=curr;
        }

         for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,1};
        // bubblesort(arr);
        // selectionsort(arr);
        insertionsort(arr);
    }
    
}
