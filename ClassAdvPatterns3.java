public class ClassAdvPatterns3 {
    public static void inverted_num(int n,int m){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
    
        }
    

    }
    public static void main(String[] args) {
        inverted_num(3, 5);
    }
    
}
