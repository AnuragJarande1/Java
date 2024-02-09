import java.util.*;
import java.util.Map.Entry;


public class Stringphirse3 {
    public static void maximumoccuringcharactery(String str){
        // str=str.toLowerCase();
        Map<Character,Integer> mp= new HashMap<>();
        char arr[]=str.toCharArray();
        for(char c: arr){
            if(mp.containsKey(c)){
                mp.put(c, mp.get(c)+1);
            }else{
                mp.put(c, 1);
            }
        }

        int maxcount=Integer.MIN_VALUE;
        int mincount=Integer.MAX_VALUE;
        char max=' ';
        char min=' ';
        for(java.util.Map.Entry<Character, Integer> entry : mp.entrySet()){

            char c=entry.getKey();
            int count=entry.getValue();

            if(count > maxcount){
                maxcount=count;
                max=c;
            }

             if(count < mincount){
                mincount=count;
                min=c;
            }

        }
        System.out.println("Maximum occurring character: " + max);
        System.out.println("Minimum occurring character: " + min);
    }
    public static void removeduplicates(String str){
        Set<Character> sp= new LinkedHashSet<>();
        char arr[]=str.toCharArray();
        for(char c: arr){
            sp.add(c);
        }

        for(char c: sp){
            System.out.print(" "+c);
        }
    }
    public static void removeduplicatesusinghashmap(String str){
        Map<Character,Integer> mp= new LinkedHashMap<>();
        char arr[]=str.toCharArray();
        for(char c: arr){
            if(mp.containsKey(c)){
                mp.put(c, mp.get(c)+1);
            }else{
                mp.put(c, 1);
            }
        }

        for(Map.Entry entry: mp.entrySet()){
            System.out.print(entry.getKey());
        }
    }
    public static void printduplicates(String str){
        Map<Character,Integer> mp= new HashMap<>();
        char arr[]=str.toCharArray();
        for(char c: arr){
            if(mp.containsKey(c)){
                mp.put(c, mp.get(c)+1);
            }else{
                mp.put(c, 1);
            }
        }

        for(Entry<Character,Integer> entry : mp.entrySet()){
            if(entry.getValue()>1){
                System.out.println(" "+entry.getKey());
            }
        }
    }
    public static void presentinsecondstring(String str,String str1){
        StringBuilder sd= new StringBuilder();
        for(int i=0;i<str.length();i++){
            int flag=0;
            for(int j=0;j<str1.length();j++){
                if(str.charAt(i)==str1.charAt(j)){
                    flag=1;
                   
                }
            }
            if(flag!=1){
                sd.append(str.charAt(i));
            }
        }
        System.out.print(" "+sd.toString());
    }
    public static void removerepeatingcharacter(String str){
        StringBuilder sd= new StringBuilder();
        for(int i=0;i<str.length();i++){
            boolean re=false;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    re=true;
                    break;
                }
            }
            if(!re){
               System.out.print(str.charAt(i));
            }
        }
        
    }
    public static void removecharacteragainpractice(String str){
        StringBuilder sd= new StringBuilder();
        Set<Character> mp= new LinkedHashSet<>();
        char arr[]=str.toCharArray();
        for(char c: arr){
            if(mp.add(c)){
                sd.append(c);
            }
        }

       System.out.println(sd.toString());
    }
    public static void repeatingcharactersprint(String str){
        char str1[]=str.toCharArray();
        for(int i=0;i<str1.length;i++){
            int count=1;
            for(int j=i+1;j<str1.length;j++){
                if(str1[i]==str1[j] && str1[i]!=' '){
                    count++;

                  str1[j]='0';
                }
            }
            if(count>1 && str1[i]!='0'){
                System.out.print(" "+str1[i]);
            }
        }
    }
    public static void printrepeatingcharacters(String str){
        Map<Character,Integer> mp= new LinkedHashMap<>();
        char arr[]=str.toCharArray();
        for(char c: arr){
            if(mp.containsKey(c)){
                mp.put(c, mp.get(c)+1);
            }else{
                mp.put(c, 1);
            }
        }

        for(Entry<Character,Integer> entry: mp.entrySet()){
            if(entry.getValue()>1){
                System.out.print(" "+entry.getKey());
            }
        }
        // for(char c: arr){
        //     if(mp.get(c)>1){
        //         System.out.println(c);
        //         break;
        //     }
        // }
    }
    public static void uncommonwords(String str1,String str2){
       String words1[]=str1.split(" ");
       String words2[]=str2.split(" ");

       Set<String> set1= new HashSet<>();
        Set<String> set2= new HashSet<>();

        for(String word : words1){
            set1.add(word);
        }

        for(String word : words2){
            set2.add(word);
        }

        List<String> un= new ArrayList<>();

        for (String word : set1) {
            if (!set2.contains(word)) {
                un.add(word);
            }
        }


        for (String word : set2) {
            if (!set1.contains(word)) {
                un.add(word);
            }
        }

    }
    public static void removelastcharacter(String str1){
        StringBuilder sd= new StringBuilder();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str1.charAt(str1.length()-1)){
                sd.append(str1.charAt(i));
            }
        }
        System.out.println(sd.toString());
    }
    public static String largestword(String str1){
      String words[]=str1.split(" ");
     int largelength=0;
     String large=" ";
     for(int i=0;i<words.length;i++){
        String word=words[i];
        if(word.length()>largelength){
            large=word;
            largelength=word.length();
        }
     }
     return large;

    }

    public static String numbertohoursandminutes(int num){
        int hours=num/60;
        int minutes=num%60;
        String output= hours +":"+ minutes;
        
        return output;
    }
    public static void removetrailingzeros(String str1){
        StringBuilder sd= new StringBuilder("");
        StringBuilder sd1= new StringBuilder("");
        boolean flag=true;
        for(int i=str1.length()-1;i>=0;i--){
           while(str1.charAt(i)=='0' && str1.charAt(i-1)=='0'){
             continue;               
           }
           sd1.append(str1.charAt(i));
           
        }
        System.out.println(sd1.toString());
    }
    public static void removestartingzeros(String str1){
        StringBuilder sd= new StringBuilder("");
        int i=0;
        while(i<=str1.length()-1 && str1.charAt(i)=='0'){
            i++;
        }
      System.out.println(str1.substring(i, str1.length()));
    }

    public static void removetrailingzerosagain(String str){
        StringBuilder sd= new StringBuilder();
        int i=str.length()-1;
        while(i>=0 && str.charAt(i)=='0'){
            i--;
        }
        System.out.println(str.substring(0,i+1));

        // int integerValue = Integer.parseInt(str);
        // return String.valueOf(integerValue);

    }
    public static void main(String[] args) {
        String str="00188900";
        String str1="001800";

        // int i=Integer.parseInt(str1);
        // System.out.println(i);

        // String stry=String.valueOf(i);
        // System.out.println(stry);

        // String s1=new String("true").intern();
        // String s2=new String("true").intern();
        // if(s1==s2){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }

        
         
        // int f=str1.lastIndexOf('o');
       

        // removetrailingzeros(str1);
        // removestartingzeros(str1);
        removetrailingzerosagain(str);
   
        // System.out.println(numbertohoursandminutes(126));
        // System.out.println(largestword(str1));
        // System.out.println(f);
        // removelastcharacter(str1);
        // maximumoccuringcharactery(str);
        // removeduplicates(str);
        // removeduplicatesusinghashmap(str);
        // printduplicates(str);
        // presentinsecondstring(str, str1);
        // removerepeatingcharacter(str);
        // removecharacteragainpractice(str);
        // repeatingcharactersprint(str);
        // printrepeatingcharacters(str);


    }
    
}
