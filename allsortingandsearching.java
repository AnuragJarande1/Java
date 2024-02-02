public class allsortingandsearching {
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int binarysearch(int arr[],int key){
        // The array must be sorted before implementing binary search
        int start=0; int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(key==arr[mid]){
                return mid;
            }else if(key>=arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static int rotatearraysearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(key==arr[mid]){
                return mid;
            }

            if(arr[start]<=arr[mid]){
                if(key>=arr[start] && key<=arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(key>=arr[mid]&& key<=arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    // Sorting
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
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

    public static void insersertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            while (prev>=0 && arr[prev]>curr) {
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
        int arr[]={5, 6, 7, 8, 9, 10, 1, 2, 3};
        // System.out.println(linearsearch(arr, 4));
        // System.out.println(binarysearch(arr, 5));
        // System.out.println(rotatearraysearch(arr, 3));
        // bubblesort(arr);
        // selectionsort(arr);
        insersertionsort(arr);
        }
    
}
