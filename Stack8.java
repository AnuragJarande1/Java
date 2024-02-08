import java.util.ArrayList;
import java.util.*;

public class Stack8 {

    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }

    // static class Stack{
    //     static Node head=null;

    //     public static boolean isEmpty(){
    //         return head==null;
    //     }

    //     public static void push(int data){
    //         Node newnode= new Node(data);

    //         if(isEmpty()){
    //             head=newnode;
    //             return ;
    //         }

    //         newnode.next=head;
    //         head=newnode;
    //     }

    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top=head.data;
    //         head= head.next;
    //         return top;
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }

    //         return head.data;
    //     }
    // }

    ArrayList<Integer> arr= new ArrayList<>();
    void push(int data){
        arr.add(data);
    }

    boolean isEmpty(){
        if(arr.size()==0){
            return true;
        }
        return false;
    }

    void pop(){
        if(isEmpty()){
            System.out.println("It is Empty");
        }else{
            arr.remove(arr.size()-1);
        }
    }

    void peek(){
        if (isEmpty()) {
            return ;
        }else{
            arr.get(arr.size()-1);
        }



    }

    void print(){
        for(int i=arr.size()-1 ;i>=0;i--){
            System.out.print(" "+arr.get(i));
        }
    }
    public static void main(String[] args) {
        // Stack s= new Stack();
        // s.push(10);
        // s.push(20);
        // s.push(30);

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        Stack8 s= new Stack8();
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        System.out.println();
        s.pop();
        s.print();

        

        
    }
    
}
