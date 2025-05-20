import java.util.*;

public class LinkListExam {
    public static void main(String[] args) {
      
      MyLinkList ml = new MyLinkList();
      ml.add(12);
      ml.add(13);
      ml.add(14);
      ml.add(15);
      
      //ml.printKaro();
      
      ml.removeLastElement();
      
      ml.printKaro();
     
  }
}
class MyLinkList{
  Node head;
  void add(int xyz){
    if(head == null){ //if first element do this 
      head = new Node(xyz);
      return;
    }
    //if not the first element do this
    Node temp = head;
    while(temp.next!=null){
      temp = temp.next;
    }
    temp.next = new Node(xyz);
      
    
  }
  //////////////////////////////////////////////////////////////////////////////
  void printKaro(){
    
    if(head==null){
      System.out.println("No element Found");
      return;
    }
    
    
    Node temp = head;
    while(temp.next!=null){
      System.out.println(temp.data);
      temp = temp.next;
    }
    System.out.println(temp.data);
  }
  //////////////////////////////////////////////////////////////////////////////////
  
  void removeLastElement(){
    if(head==null){  //no element
      System.out.println("No element to be Removed");
      return;
    }
    if(head.next==null){  //if list has 1 element
      head=null;
      return;
    }
    
   Node temp = head;
    while(temp.next.next!=null){
      temp = temp.next;
      
    }
    temp.next=null;     //remove last element
  }
  
  
}
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}




