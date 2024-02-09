import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Stringphirse2 {
    public static void maximumoccuringcharacter(String str){
    char arr[]=str.toCharArray();
    Map<Character,Integer> mp = new HashMap<>();
    for(char c: arr){
        if(mp.containsKey(c)){
            mp.put(c, mp.get(c)+1);
        }else{
            mp.put(c, 1);
        }
    }

    int count=0;
    char maxchar=' ';
    for(Entry<Character,Integer> entry: mp.entrySet()){
        if(entry.getValue()>count){
            count=entry.getValue();
            maxchar=entry.getKey();
        }
    }

    if(count>0){
        System.out.println("The max character is "+maxchar);
        System.out.println(" The count is "+count);
    }else{
        System.out.println("There is nothing");
    }

    
}
public static void removeduplicates(String str){
    Set<Character> sp= new LinkedHashSet<>();
    char arr[]=str.toCharArray();
    for(char c: arr){
        sp.add(c);
      
    }
    for( char c: sp){
        System.out.print(c);
    }

    
}
public static void removeduplicatesy(String str){
    Map<Character,Integer> mp= new HashMap<>();
    char arr[]=str.toCharArray();
    for(char c: arr){
        if(mp.containsKey(c)){
            mp.put(c, mp.get(c)+1);
        }else{
            mp.put(c, 1);
        }
    }

    for(Map.Entry entry : mp.entrySet()){
       System.out.print(entry.getKey());
    }
}
public static void duplicates(String str){
    Map<Character,Integer> mp= new HashMap<>();
    char arr[]=str.toCharArray();
    for(char c: arr){
        if(mp.containsKey(c)){
            mp.put(c, mp.get(c)+1);
        }else{
            mp.put(c,1);
        }
    }

    for(Entry<Character,Integer> entry: mp.entrySet()){
        if(entry.getValue()>1){
            System.out.print(entry.getKey());
        }
    }
}
public static void presentinsecondstring(String str1,String str2){
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    // System.out.print(str1);
    // System.out.print(str2);
    StringBuilder sd= new StringBuilder();
    StringBuilder sd1= new StringBuilder();
    // int i=0,j=0;
    // while(i<str1.length()-1 && j<str2.length()-1){
    //     if(str1.charAt(i)!=str2.charAt(j)){
    //          i++;
    //         j++;
    //         sd.append(str1.charAt(i));
           
    //     }else{
    //         sd1.append(str1.charAt(i));
    //     }
    // }
    // System.out.print(sd.toString());
    for(int i=0;i<str1.length();i++){
        int flag=0;
        for(int j=0;j<str2.length();j++){
            
            if(str1.charAt(i)==str2.charAt(j)){
                flag=1;
            }

        }
        if(flag!=1){
            sd.append(str1.charAt(i));
        }
    }
    System.out.println(sd.toString());
    
}
public static void presenty(String str1,String str2){
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();
     StringBuilder sd= new StringBuilder();
    Map<Character,Integer> mp =new HashMap<>();
    for(int i=0;i<str2.length();i++){
        mp.put(str2.charAt(i), 1);
    }
    for(int i=0;i<str1.length();i++){
        if(mp.get(str1.charAt(i))==null){
            sd.append(str1.charAt(i));
        }
    }
    System.out.println(sd.toString());
}
public static boolean rotationofeachother(String str1,String str2){
    String s=str1+str1;
    if(s.contains(str2)){
        return true;
    }
    return false;

}
public static void repeat(String str1,String str2){
    StringBuilder sd= new StringBuilder();
     str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    int j=0;
    for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)!=str2.charAt(j)){
            sd.append(str1.charAt(i));
            j++;
        }
    }
    System.out.println(sd.toString());

}
public static void reversestring(String str){
      StringBuilder sd= new StringBuilder();
      for(int i=str.length()-1;i>=0;i--){
        sd.append(str.charAt(i));
      }
      System.out.print(""+sd.toString());  
}

public static void reversewordS(String str){
   StringBuilder sd= new StringBuilder();
   String words[]=str.split(" +");
   for(int i=words.length-1;i>=0;i--){
    sd.append(words[i]);
    sd.append(" ");
   }
   System.out.println(sd.toString().trim());
}
public static void firstnonrepeat(String str){
    Map<Character,Integer> mp= new HashMap<>();
    char arr[]=str.toCharArray();
    for( char c: arr){
        if(mp.containsKey(c)){
            mp.put(c, mp.get(c)+1);
        }else{
            mp.put(c, 1);
        }
    }
    for( char c: arr){
        if(mp.get(c)==1){
            System.out.println(c);
            break;
        }
    }
}
public static void anagrams(String str1,String str2){
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    if(str1.length()==str2.length()){
        char c1[]=str1.toCharArray();
        char c2[]=str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean result=Arrays.equals(c1, c2);
        if(result){
            System.out.println("They are anagrams");
        }else{
            System.out.println("They are not");
        }

    }
}
public static boolean palindrome(String str){
    for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
    }
    return true;
}
public static void removegivencharacter(String str1){
    StringBuilder sd= new StringBuilder();
    for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)!='m'){
           sd.append(str1.charAt(i));
        }
    }
    System.out.println(sd.toString());
}
public static void countnumberwords(String str1){
    // int count=1;
    // for(int i=0;i<str1.length();i++){
    //     if(str1.charAt(i)==' ' && str1.charAt(i+1)!=' '){
    //         count++;
    //     }
    // }
    String word[]=str1.split(" +");
    int count=word.length;
    System.out.println(count);
}
public static void uncommonwords(String str1, String str2){
    String str[]=str1.split(" ");
    String stry[]=str2.split(" ");

    for(int i=0;i<str.length;i++){
        for(int j=0;j<stry.length;j++){
            if(str[i]!=stry[j]){
                System.out.print(str[i]);
            }
        }
    }
}

public static void finduncommonwords(String str1,String str2){
    StringBuilder sd= new StringBuilder();
    String a[]=str1.split(" ");
    String b[]=str2.split(" ");
  
   int i=0,j=0;
   while(i<=a.length-1 && j<=b.length-1){
       if(a[i]==b[j]){
        i++;
        j++;
       }else{
        sd.append(a[i]);
       }
   }
   System.out.println(sd.toString());

}

public static void uncommoncharactersoftwostrings(String k,String l){
   char arr[]=k.toCharArray();
   char arr1[]=l.toCharArray();
   Set<Character> mp= new HashSet<>();
   for(char c:arr){
     mp.add(c);
   }

   for(char h:arr1){
     if(mp.contains(h)){
        mp.remove(h);
     }else{
        mp.add(h);
     }
   }

   System.out.println(mp);
}

public static void uncommonwordsinstring(String str1,String str2){
     String arr[]=str1.split(" ");
   String arr1[]=str2.split(" ");
   Set<String> mp= new HashSet<>();
   for(String c:arr){
     mp.add(c);
   }

   for(String h:arr1){
     if(mp.contains(h)){
        mp.remove(h);
     }else{
        mp.add(h);
     }
   }

   System.out.println(mp);
}
    public static void main(String[] args) {
        String str="123";
        String k="characters";
        String l="alphabets";

        // uncommoncharactersoftwostrings(k, l);
        // int i=Integer.parseInt(str);
        // int l=2;
        // int c=i+l;
        // System.out.println(c);
        
        int n=Integer.parseInt(str);
       
        
        // System.out.println(n);
         
       
        int arr[]={1,2,3,4};
        // maximumoccuringcharacter(str);
    //     removeduplicates(str);
    //    removeduplicatesy(str);
    // duplicates(str);
    String str1="apple apple";
    String str2="banana";
       uncommonwordsinstring(str1, str2);
    // uncommonwords(str1, str2);
    // finduncommonwords(str1, str2);
    // presentinsecondstring(str1, str2);
    // presenty(str1, str2);
    // System.out.println(rotationofeachother(str1, str2));
    // repeat(str1, str2);
    // reversestring( str);
    // reversewordS(str);
    // firstnonrepeat(str);
    // anagrams(str1, str2);
    // System.out.println(palindrome(str));
    // removegivencharacter(str1);
    StringBuilder sd= new StringBuilder();
    // countnumberwords(str1);
    // Scanner sc= new Scanner(System.in);
    // System.out.println("Enter a String");
    // String str3=sc.nextLine();
    // str3=str3.toLowerCase();
    // System.out.println("Enter a Character");
    // String str4=sc.next();
    // char c=str3.charAt(0);
    // for(int i=0;i<str3.length();i++){
    //     if(str3.charAt(i)!=c){
    //        sd.append(str3.charAt(i));
    //     }
    // }
    // System.out.println("You output is :" + sd.toString());

  

   




    }
    
}
 
