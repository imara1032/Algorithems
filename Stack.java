/**
A stack is an Abstract Data Type (ADT), commonly used in most programming languages.
 It is named stack as it behaves like a real-world stack, for example – a deck of cards
 or a pile of plates,
**/
import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        LinkedList list=new LinkedList();
        list.push(3);
        list.push(2);
        list.push(1);
        list.push(4);
        System.out.println(list.length());
        list.printAll();
        list.pop();
       
        list.pop();
        System.out.println(list.length());
        
        list.printAll();
    }
    
    
}
class Node{
    Node next=null;
    int data;
    public Node(int val){
        data=val;
    }
}
class LinkedList{
    Node head;
    public LinkedList(){
        head=null;
    }
    public void push(int val){
        if(head == null)
            head=new Node(val);
        else{
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        }
    }
    public int pop(){
        if(head == null)
            return 0;
        int data_pop=head.data;
        Node tep=head.next;
        head=tep;
        return data_pop;
    }
    public int length(){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
         return size;   
    }
    public void printAll(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}