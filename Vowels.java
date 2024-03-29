class Solution {
    public String reverseVowels(String str) {
        char arr[]=str.toCharArray();
        int i=0;
        int j=arr.length-1;

        while(i<j){
            while(i<j && !isVowel(arr[i])){
                i++;
            }

            while(i<j && !isVowel(arr[j])){
                j--;
            }

            if(i<j){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }

        return new String(arr);

      
    }
     private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}