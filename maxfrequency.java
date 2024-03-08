class Solution {
    public int maxFrequencyElements(int[] arr1) {
       Map<Integer,Integer> mp= new HashMap<>();
       for(int i=0;i<arr1.length;i++){
           if(mp.containsKey(arr1[i])){
               mp.put(arr1[i],mp.get(arr1[i])+1);
           }else{
               mp.put(arr1[i],1);
           }
       }

       int maxfrequency=0;

       for(int frequency: mp.values()){
           maxfrequency=Math.max(maxfrequency,frequency);
       }

       int count=0;
       for(int frequency: mp.values()){
           if(frequency==maxfrequency){
               count+=frequency;
           }
       }

       return count;

    }
}