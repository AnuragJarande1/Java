class Solution {
    public int[] resultArray(int[] nums) {
      ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

          arr1.add(nums[0]);
          arr2.add(nums[1]);

        int i=2;
        while(i<nums.length){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1))
                arr1.add(nums[i]);
            else
                arr2.add(nums[i]);
               
            
              i++;
          
        }
        
        int l=arr1.size();
        int m=arr2.size();
        
        int arr3[]= new int[l+m];
        int k=0;
        for(int nums1: arr1){
            arr3[k++]=nums1;
        }
        
        for(int nums2: arr2){
            arr3[k++]=nums2;
        }
        
        return arr3;
    }
}