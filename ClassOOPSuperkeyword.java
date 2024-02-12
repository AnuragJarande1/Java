import javax.sound.sampled.SourceDataLine;

public class ClassOOPSuperkeyword {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.just();
    }
    
    
}
class Animal{
    void hello(){
        System.out.println("Animal constructor is called");
    }
    public void runs(){
        System.out.println("Hi guys");
    }
}
class Horse extends Animal{
    
   void just(){
    super.hello();
    super.runs();
    
    System.out.println("Horse runs very fast");
   }
}
