class Solution {
    public int missingNumber(int[] arr) {
     int sum1=0;
     int sum2=((arr.length*(arr.length+1))/2);
     for(int i=0;i<arr.length;i++){
         sum1+=arr[i];
     }
     int sum3=sum2-sum1;
     return sum3;
    }
}