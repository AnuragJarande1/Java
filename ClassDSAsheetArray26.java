import java.util.Arrays;

public class ClassDSAsheetArray26 {
    public static int watery(int arr[]){
      int i=0;
      int j=arr.length-1;
      int water=0;

      while(i<j){
        int w=j-i;
        int h=Math.min(arr[i], arr[j]);

        water=Math.max(water, h*w);

        if(arr[i]<arr[j]){
            i++;
        }else{
            j--;
        }
      }
      return water;
    }
    public static int smallest(Integer arr1[],int k){
        Arrays.sort(arr1);

        return arr1[k-1];
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        Integer arr1[]={7 ,10 ,4, 3, 20 ,15};
        int k=3;
        // System.out.println(watery(arr));
        System.out.println(smallest(arr1, k));
        

    }
    
}
