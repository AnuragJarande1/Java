import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Arrayphirse1 {
    public static void missing(int arr[]){
        
        int sum2=0;

        for(int i=0;i<arr.length;i++){
            sum2=sum2+arr[i];
        }
       int actual=(arr.length*(arr.length+1))/2;
       int missing=actual-sum2;
       System.out.println(missing);
    }
    public static void subarray(int arr[]){
       for(int i=0;i<arr.length;i++){
        int start=i;
        for(int j=i;j<arr.length;j++){

            int end=j;

            for(int k=start;k<=end;k++){
                System.out.print(" "+arr[k]);
            }
            System.out.println();

        }
        System.out.println();
       }
        
    }
    public static void maxsubarray(int arr[]){
        int maxarray=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;

            for(int j=i;j<arr.length;j++){
                int end=j;

                int currsum=0;

                for(int k=start;k<=end;k++){
                   currsum+=arr[k];
                }
                System.out.println(currsum);

                if(maxarray<currsum){
                    maxarray=currsum;
                }

            }
        }
        System.out.println("The max subarray is "+maxarray);
    }
    public static void reverse(int arr[]){
        int start=0,end=arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
       public static void maxsubarrayss(int arr[]){
        int count=0;
        int maxarray=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;

            for(int j=i;j<arr.length;j++){
                int end=j;

                int currsum=0;

                for(int k=start;k<=end;k++){
                   currsum+=arr[k];
                }
                System.out.println(currsum);
                 count=0;

              if(currsum<0){
                count++;
              }
               System.out.println(count);

            }
            
        }
        System.out.println(count);
       
    }

    public static int  linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void largest(int arr[]){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
           max=Math.max(max, arr[i]);
        }
        System.out.println("The max array is "+max);
    }

    public static int  binarysearch(int arr[],int key){
        int start=0,end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(key>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
        
    }

    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
        
    }
    public static void kadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
              ms=Math.max(cs, ms);
            if(cs<0){
                cs=0;
            }
          
        }
        System.out.println("The maxsubarray is "+ms);
    }

    public static int buyandsellPrice(int prices[]){
        int buypr=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            if(buypr<prices[i]){
                int profit=prices[i]-buypr;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buypr=prices[i];
            }
        }
        return maxprofit;
    }

    public static void missin(int arr1[] ){
        int n=arr1.length+1;
        int sum=n*(n+1)/2;
        int sum1=0;

        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
        }
        int sum3=sum-sum1;
        System.out.println(sum3);
    }
    public static void duplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   System.out.println(arr[j]);
                }
            }
        }
    
    }
        public static int firstduplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   return i;
                }
            }
        }
        return -1;
    
    }
    public static void largestsmallest(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The maximum number is "+max);
        System.out.println("The minimum number is "+min);
    }
    public static void pairsy(int arr1[]){
        int sum=7;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]+arr1[j]==sum){
                    System.out.print("("+arr1[i]+","+arr1[j]+")");
                }
            }
        }

    }
    public static void duplicatetwotimes(int arr[]){
        boolean ifPresent = false;
        ArrayList<Integer> al= new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    if(al.contains(arr[i])){
                        break;
                    }else{
                        al.add(arr[i]);
                        ifPresent=true;
                    }
                }
            }
        }
        if (ifPresent == true) {
 
            System.out.print(al + " ");
        }
        else {
            System.out.print(
                "No duplicates present in arrays");
        }
    }
    public static void removeduplicates(int arr[]){
      int temp[]= new int[arr.length];


    }
    public static int twice(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int count=0;
          for(int j=0;j<arr.length;j++){
            if(arr[j]==num){
                count++;
            }
            
          }
          if(count==1)
                return num;
          
        }
        return -1;
       
    }
    public static void removeduplicateagain(int arr[]){
        Set<Integer> mp= new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            mp.add(arr[i]);
        }

        for(int a : mp){
            System.out.println(""+a);
        }
    }
    public static void removeelement(int arr[],int key){
        int temp []=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i]!=key){
               temp[j]=arr[i];
               j++;
             }
        }
        for(int i=0;i<j;i++){
            System.out.println(temp[i]);
        }
        
    }
    public static void removeelemntwithoutextraspace(int arr[],int key){
        int j=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]!=key){
              arr[j]=arr[i];
              j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
    }
    public static void movezeroswithoutextraspace(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
                  
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
           
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    
    }

    public static void movezeros(int arr[]){
        int temp[]= new int[arr.length];
        int j=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }else{
                count++;
            }
         
         
        }
           while(count!=0){
                temp[j]=0;
                count--;
                j++;
            }
           
         for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        
    }

    public static int removeduplicateswithoutextraspace(int arr[],int n){
        if (n == 0 || n == 1)
        return n;
  
    // To store index of next unique element
    int j = 0;
  
    // Doing same as done in Method 1
    // Just maintaining another updated index i.e. j
    for (int i = 0; i < n-1; i++)
        if (arr[i] != arr[i+1])
            arr[j++] = arr[i];
  
    arr[j++] = arr[n-1];
  
    return j;
      

    }
    public static void movenegatives(int arr[]){
        int temp[]= new int[arr.length];
        int j=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                temp[j++]=arr[i];
            }else{
               
            }

        }
        for(int i=0;i<j;i++){
            System.out.print(temp[i]);
        }
     
    }
    public static void movenegativesslittlespace(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void alternatepositivenegative(int arr[]){
        int arr1[]= new int[arr.length];
        int i=0;
        int n1=arr1.length;
        int j=0;
        int arr2[]= new int [arr.length];
        int n2=arr2.length;
        int k=0;
        // int arr3[]= new int[n1+n2];


        for( i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr1[j++]=arr[i];
            }else{
                arr2[k++]=arr[i];
            }
        }
        for( i=0;i<j;i++){
            System.out.print(arr1[i]);
        }
        System.out.println();
        for( i=0;i<k;i++){
            System.out.print(arr2[i]);
        }
        System.out.println();

        int a=0,b=0,c=0;

        while(a<j && b<k){
            arr[c]=arr1[a];
            c++;
            arr[c]=arr2[b];
            c++;

            a++;
            b++;

        }

        while(a<j){
            arr[c]=arr1[a];
          
            a++;
            c++;
        }

        while(b<k){
            arr[c]=arr2[b];
           
            b++;
            c++;
        }
          System.out.println();
        for(int l=0;l<c;l++){
            System.out.print(arr[l] + " ");
        }

       
    }
    public static void alternate(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static boolean subarraysum(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int  sum=0;

                for(int k=start;k<=end;k++){
                    sum+=arr[k];

                    if(sum==0)
                    return true;
                    
                }
                // System.out.println(sum);
                
             
            }
        }  
        return false;

    }
    public static void  firstandsecondlarge(int arr[]){
         int maxone=Integer.MIN_VALUE;
         int maxtwo=Integer.MAX_VALUE;

         for(int i=0;i<arr.length;i++){
            if(maxone<arr[i]){
                maxtwo=maxone;
                maxone=arr[i];
            }else if(maxtwo<arr[i]){
                maxtwo=arr[i];
            }
         }
         System.out.println("top two elements are: " + maxone + " " + maxtwo);
    }
    public static void kthsmallest(int arr[],int key){
        Arrays.sort(arr);
        System.out.println(arr[key-1]);
    }
    public static int firstrepeat(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static int firstnonrepeating(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int j;
            // Checking if ith element is present in array
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            // if ith element is not present in array
            // except at ith index then return element
            if (j == n)
                return arr[i];
        }
        return -1;
    }

    public static void evenodd(int arr1[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
          int num=arr1[i];

          if(num%2!=0){
            System.out.println(arr1[i]);

            if(max<arr1[i]){
                max=arr1[i];
            }
          }

        }
        System.out.println("The largest odd number is "+ max);
    }

    public static void prime(int arr1[]){
        int max=Integer.MIN_VALUE;
        for(int i=2;i<=arr1[i];i++){
            int num=arr1[i];

            if(num%i==0){
                System.out.println(arr1[i]);
            }
        }
    }
    public static void countsubarrayzeroandones(int arr[]){
        int ones=0;
        int zeros=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;

                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");

                    if(arr[k]==1){
                       ones++;
                       
                    }else{
                        zeros++;
                    }

                }
                System.out.println();

                if(ones==zeros){
                    count++;

                   

                    System.out.println();
                }
                  ones=0;
                  zeros=0;

            
              


        }
  
    }
          System.out.println("count = "+count);
                    

    }

    public static void missingandrepeated(int arr[]){
        Arrays.sort(arr);
        
         int temp[]=new int[arr.length];
         int j=0;
        for(int i=0;i<arr.length-1;i++)
              
             if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];

                temp[j++]=arr[arr.length-1];
             }else{
                System.out.println("The repeat is  "+arr[i]);
             }
             
            
                // for(int i=0;i<j;i++){
                //     System.out.println(temp[i]);
                // }
               
        
       
        int n=temp.length;
        int sum1=0;
        int sum2=n*(n+1)/2;

        for(int i=0;i<temp.length;i++){
            sum1+=temp[i];
        }
        int sum3=sum2-sum1;

        System.out.println("The missing is "+sum3);
         

    }
    public static int duplicatehatao(int arr[],int n){
        Arrays.sort(arr);
             // Return, if array is empty or
        // contains a single element
        if (n == 0 || n == 1)
        return n;

    int[] temp = new int[n];

    // Start traversing elements
    int j = 0;
    for (int i = 0; i < n - 1; i++)
         
        // If current element is not equal to next
        // element then store that current element
        if (arr[i] != arr[i + 1])
            temp[j++] = arr[i];

    // Store the last element as whether it is unique or
    // repeated, it hasn't stored previously
    temp[j++] = arr[n - 1];

    // Modify original array
    for (int i = 0; i < j; i++)
        arr[i] = temp[i];

    return j;
    }

    public static void countfrequency(int arr2[]){
        int freq[]= new int[arr2.length];
        int visited=-1;

        for(int i=0;i<arr2.length;i++){
            int count=1;
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[i]==arr2[j]){
                    count++;
                    freq[j]=visited;
                }
                if(freq[i]!=visited){
                    freq[i]=count;
                }
            }
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=visited){
                System.out.println("Element|Frequency");
                System.out.println(arr2[i]+ " | "+freq[i]);
            }
        }
    }
  
    public static void leftshift(int arr1[],int k){
        for(int j=0;j<k;j++){
        int first=arr1[0];
        for(int i=0;i<arr1.length-1;i++){
            arr1[i]=arr1[i+1];
        }
        arr1[arr1.length-1]=first;
    }
        
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
    public static void rightshift(int arr1[],int k){
        for(int j=0;j<k;j++){
        int last=arr1[arr1.length-1];
        for(int i=arr1.length-1;i>0;i--){
            arr1[i]=arr1[i-1];
        }
        arr1[0]=last;
    }

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    public static void kthlargestelement(int arr1[],int key){
        int start=0;int end=arr1.length-1;
        while(start<end){
            int temp=arr1[start];
            arr1[start]=arr1[end];
            arr1[end]=temp;
            start++;
            end--;
        }
      for(int i=0;i<arr1.length;i++){
          System.out.print(arr1[i]);
        }
        System.out.println();
        System.out.println(arr1[key-1]);

       
    }
      
    public static String revrsewords(String str){
        String words[]=str.split("  +");
        StringBuilder sd= new StringBuilder("");
        for(int i=words.length-1;i>=0;i--){
            sd.append(words[i]);
            sd.append(" ");
        }
        return sd.toString().trim();
    }

    public static String reversewordsfromspot(String str){
        StringBuilder sd= new StringBuilder();
        String words[]=str.split(" ");
        for( String word: words){
            StringBuilder sd1= new StringBuilder(word);
            sd1.reverse();
            sd.append(sd1);
            sd.append(" ");
            
        }
        return sd.toString();
    }
    public static void thirdlargest(int nums[]){
        
  HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int arr1[]= new int[hs.size()];
        int k=0;
        for(int i:hs){
            arr1[k]=i;
            k++;
        }
         if(nums.length==1){
            System.out.println(nums[0]);
        }
        if(nums.length==2){
            System.out.println(Math.max(nums[0], nums[1]));
        }
         Arrays.sort(arr1);
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(first<arr1[i]){
                third=second;
                second=first;
                first=arr1[i];
            }
          
            if(arr1.length==2){
                third=first;
            }
           
        }
        System.out.println(third);  
    }
    public static void thirdy(int nums[]){
        if(nums.length==1){
            System.out.println(nums[0]);
        }
        if(nums.length==2){
            System.out.println(Math.max(nums[0], nums[1]));
        }
          int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==first||nums[i]==second||nums[i]==third)
                continue;
            if(i>first){
                 third=second;
                second=first;
                first=nums[i];
            }
            else if(i>second){
                third=second;
                 second=nums[i];
            }
            else if(i>third){
                third=nums[i];
            }    

            
        }
        if(third==Integer.MIN_VALUE){
            System.out.println(first);

            System.out.println(third);
        }
        
    } 

    public static void kadanesy(int arr[]){
        int cs=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             cs+=arr[i];
              max=Math.max(cs, max);
             if(cs<0){
                cs=0;
             }
            


        }
        System.out.println(max);
    }


    public static void threelargest(int arr[]){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(first<arr[i]){
                third=second;
                second=first;
                first=arr[i];
            }else if(second<arr[i] && first>arr[i]){
                third=second;
                second=first;
            }else if(second>arr[i] && third<arr[i]){
                third=second;
            }
        }

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key=2;
        String str="    I   Love My  Country    ";
        str=str.replace("\\s + "," ").trim();
        // System.out.println(str);
        int nums[]={1,1,1};
        int arr2[]={1,2,3,4,2,2,3,1};
        int prices[]={7,1,5,3,6,4};
       
        // System.out.println(revrsewords(str));
        System.out.println(reversewordsfromspot(str));
        // threelargest(arr);
        // kadanesy(arr);
        // removeduplicateagain(arr);
        // reverse(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(" "+arr[i]);
        // // }
        // missing(arr);
        // subarray(arr);
        // maxsubarray(arr);
        // maxsubarrayss(arr);
    //    System.out.println(linearsearch(arr, key));
    // largest(arr);
    // System.out.println(binarysearch(arr, key));
    // pairs(arr);
    // kadanes(arr);
    // System.out.println(buyandsellPrice(prices));
    // missin(arr1);
    // int index=firstrepeat(arr);
    // if (index == -1) {
    //     System.out.println("No repeating element found!");
    // }
    // else {
    //     // Printing the first repeating element and its index
    //     System.out.println("First repeating element is " + arr[index]);
    // }

    // largestsmallest(arr);
//  pairsy(arr1);
// duplicate(arr);
// duplicatetwotimes(arr);
// removeduplicates(arr);
// movezeroswithoutextraspace(arr);
// int ans=twice(arr);
// System.out.println("The single element is "+ans);
// removeelement(arr, key);
// movezeros(arr);
// int n=arr.length;
// n= removeduplicateswithoutextraspace(arr, n);
// for(int i=0;i<n;i++){
//     System.out.print(arr[i]+" ");
// }

// movenegatives(arr);
// movenegativesslittlespace(arr);

// alternatepositivenegative(arr);
// if(subarraysum(arr)){
//     System.out.println("FOund with 0");
// }else{
//     System.out.println("Not found with 0");
// }
// maxsubarray(arr);

// firstandsecondlarge(arr);

// // kthsmallest(arr, key);
// System.out.println(firstnonrepeating(arr));
// alternatepositivenegative(arr);
// evenodd(arr1);
// prime(arr1);
// countsubarrayzeroandones(arr);
// int n=arr.length;
// missingandrepeated(arr);


// alternate(arr);
// int n = arr.length;
 
// // removeDuplicates() returns new size of array
// n = duplicatehatao(arr, n);

// // Print updated array
// for (int i = 0; i < n; i++)
//     System.out.print(arr[i] + " ");

// countfrequency(arr2);
// // leftshift(arr1,2);
// rightshift(arr1,2);
// kthlargestelement(arr1, key);
// thirdlargest(nums);
// thirdy(nums); // System.out.println(revrsewords(str));



























        


    }
    
}
