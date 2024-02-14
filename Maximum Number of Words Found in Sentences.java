class Solution {
    public int mostWordsFound(String[] sentences) {
       int count=0;
       int max=Integer.MIN_VALUE;

       for(String s: sentences){
           String str[]=s.split(" ");
           for(String w: str){
               count++;
           }

           if(count>max){
               max=count;
           }

           count=0;
       }

       return max;

    }
}