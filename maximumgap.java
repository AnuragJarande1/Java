class Solution {
    public int maximumGap(int[] nums) {
        int max=0;
        int maxy=0;

        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
          if(nums[i]>nums[i-1]){
              max+=nums[i]-nums[i-1];

              if(maxy<max){
                  maxy=max;
              }
              max=0;
          }
        }

        return maxy;
        
    }
}