import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassStringspecial104 {
    public static void special(String s){
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!Character.isLetterOrDigit(c)){
                System.out.println(c);
            }
        }
    }
    public static void main(String[] args) {
        String s="adad,dsd r dsdsd,,,,,/////";
        // String REGEX="[,./]";
        // Pattern pattern=Pattern.compile(REGEX);
        // Matcher matcher=pattern.matcher(s);

        // for(int i=0;i<s.length();i++){
        //     if(matcher.find()){
        //         System.out.println(matcher.group(0));
        //     }
        // }
        special(s);
    }
}

