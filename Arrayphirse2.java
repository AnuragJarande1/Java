import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Arrayphirse2 {

    public static void HashMapusingfrequency(int arr[]){
        HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else{
                hm.put(arr[i], 1);
            } 
        }

        for(Map.Entry entry:hm.entrySet()){
            System.out.println("Element | Frequency");
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static void duplicateremoval(int arr[]){
        // Arrays.sort(arr);
        // int temp[]=new int[arr.length];
        // int j=0;
        // for(int i=0;i<arr.length-1;i++){
        //      if(arr[i]!=arr[i+1]){
        //         arr[j++]=arr[i];
        //      }
        // }
        // arr[j++]=arr[arr.length-1];
        
        // for(int i=0;i<j;i++){
        //     System.out.print(arr[i]);
        // }
       
        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[j++]=arr[i];
            }
        }

        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
      
    }
    public static void duplicateremovaly(int arr[]){
        HashMap<Integer,Boolean> mp=new HashMap<>();

        for(int i=0;i<arr.length;i++){
        if(mp.get(arr[i])==null){
            System.out.print(arr[i]+ " ");

            mp.put(arr[i], true);
        }
        }
    }

    public static void removalys(int arr[]){
        HashMap<Integer,Integer> mp= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }else{
                mp.put(arr[i], 1);
            }
        }

       for(Map.Entry entry:mp.entrySet()){
         
            System.out.println(entry.getValue());
        }
    }
    public static void findduplicate(int arr[]){
        Set<Integer> unique= new HashSet<>();
        boolean isDuplicate=false;

        for(int i=0;i<arr.length;i++){
            if(unique.contains(arr[i])){
                isDuplicate=true;
                System.out.println("Duplicate Element "+arr[i]);
            }else{
                unique.add(arr[i]);
            }
        }
        // if(isDuplicate){
        //     System.out.println(-1);
        // }
    }
    public static void reverse(int arr[],int i,int j){
        int start=0,end=arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void rotate(int arr[],int k){
        for(int j=0;j<k;j++){
        int first=arr[arr.length-1];
       for(int i=arr.length-1;i>0;i--){
        arr[i]=arr[i-1];
       }
       arr[0]=first;
    }
    
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
    public static String reverse(String str){
        StringBuilder sd = new StringBuilder("");

        for(int i=str.length()-1;i>=0;i--){
            sd.append(str.charAt(i));
        }
        return sd.toString();
        
    }
    public static void secondlargest(int arr[]){
        int large=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){
               second=large;
               large=arr[i];
            }
        }
        System.out.println("The second smallest is "+ second);
        System.out.println(large);
    }
    public static void removeduplicates(int arr[]){
        Set<Integer> hm= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hm.add(arr[i]);
        }

        for(int a : hm){
            System.out.println(a);
        }
    }
    public static void removedupi(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                arr[++j]=arr[i];
            }
        }

        for(int i=0;i<=j;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static String reverseword(String str){
        String stri=(String) str.replaceAll("\\s+", " ").trim();
        StringBuilder sd= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sd.append(str.charAt(i));
        }
        return sd.toString();

    }

    public static void subarray(int arr[]){
        int maxarray=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        int start=i;
        for(int j=i;j<arr.length;j++){
          int end=j;
          int product=1;
          for(int k=start;k<=end;k++){
            product*=arr[k];
          }
          System.out.println(product);
          if(maxarray<product){
            maxarray=product;
          }

        }
      }
      System.out.println("The maxproduct is "+maxarray);
    }
     public static void exceptselfsubarray(int arr[]){
        int maxarray=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        int start=i;
        for(int j=i+1;j<arr.length;j++){
          int end=j;
          int product=1;
          for(int k=start;k<=end;k++){
            System.out.print(arr[k]);
          }
          System.out.println();
          if(maxarray<product){
            maxarray=product;
          }
          System.out.println();

        }
      }
      System.out.println("The maxproduct is "+maxarray);
    }

    public static boolean validpalindrome(String str){
        str=str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int n=str.length();
        System.out.println(str);
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void reverse(String[] str1){
        StringBuilder sd= new StringBuilder("");
        for(int i=str1.length;i>=0;i--){
            sd.append(str1.length);
        }
    }
    public static void removeduplya(int arr[]){
        Set<Integer> sh= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            sh.add(arr[i]);
        }
        for(int a: sh){
            System.out.print(a);
        }
    }
    public static void reversewordy(String str){
        StringBuilder sd= new StringBuilder("");
         int i=str.length()-1;
         while(i>=0){
            while(i>=0 && str.charAt(i)==' ')i--;
             int j=i;
             if(i<0) break;
            while(i>=0 && str.charAt(i)!=' ')i--;
           
            if(sd.length()==0){
                sd.append(str.substring(i+1, j+1));
            }else{
                sd.append(" "+str.substring(i+1, j+1));
            }


         }
         System.out.println(sd.toString());
    }
    public static String reversyword(String str){
        String[] words=str.split(" +");
        StringBuilder sd= new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sd.append(words[i]);               
            sd.append(" ");
        }
        return sd.toString().trim();

    }
    public static void rank(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(i+1);
        }
    }
    public static void nonrepeating(int arr[]){
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(mp.get(arr[i])==1){
                System.out.print(" "+arr[i]);
            }
        }
    }
    public static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(" "+fact);
    }
    public static int recursionnaturalnumbers(int n){
        if(n==0){
            return n;
        }
        return n+recursionnaturalnumbers(n-1);
    } 
    public static boolean palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                 return false;
            }
        }
        return true;
    }
    public static void missing(int arr[]){
         int n=arr.length+1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int actual=(n*(n+1))/2;
        int ans=actual-sum;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4};
        String[] str1={"h","e","l","l","o"};
         String str="$Gee*k;s..fo, r’Ge^eks?";

        //  rotate(arr, 1);
        missing(arr);
        //  System.out.println(reverse(str));
        //  secondlargest(arr);
        // duplicateremoval(arr);
        // duplicateremovaly(arr);

        // removalys(arr);
        // findduplicate(arr)
        // rotate(arr,2);
        // System.out.println(str.replaceAll("\\s+", " ").trim());
        // removeduplicates(arr);
        // removedupi(arr);
        // System.out.println(reverseword(str));
        // subarray(arr);
        // System.out.println(validpalindrome(str));
        // exceptselfsubarray(arr);
        // removeduplya(arr);
        // System.out.println(reversyword(str));
        //    reversewordy(str);
        // System.out.println(reverseword(str));
        // String str3="abababa";
        // String s1="aba";
        // String s2="a";
        // String repo=str3.replace(s1, s2);
        // System.out.print(repo);
        // rank(arr);
        // nonrepeating(arr);
        // factorial(5);
        // // int sum=0;
        // // for(int i=1;i<=10;i++){
        // //     sum+=i;
        // // }
        // // System.out.println(sum);
        // System.out.println(recursionnaturalnumbers(10));
        //    System.out.println(palindrome(str));
        missing(arr);
        char c[]={'a','b','c'}; //to sum the ascii values;
          int sum=0;
        for(char a: c){
           sum+=a;
        }
        System.out.println(sum);
        str=str.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(str);
       





        



        
    
       
       


       

        
    }
    
}
