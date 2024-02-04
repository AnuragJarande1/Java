public class ClassBublesortpractice {
    public void bubblesort(int a[]){
        for(int turn=0;turn<a.length-1;turn++){
            for(int j=0;j<a.length-1-turn;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
    }
    public static void printarr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print (a[i]+" ");
        }
        System.out.println();
    }
public static void main(String[] args) {
    int a[]={5,7,2,3,1};
    ClassBublesortpractice b=new ClassBublesortpractice();
    b.bubblesort(a);
    b.printarr(a);
    
}    
}

