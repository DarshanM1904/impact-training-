import java.util.*;

public class NewClass{
    public static void main(String[] args) {
      
      //queue
      //2 ways to make a queue in java
      //using an array 
      //using a linkedlist
      
      MyQueue mq = new MyQueue(10);
      mq.enqueue(12);
      mq.enqueue(13);
      mq.enqueue(14);
      mq.enqueue(17);
      mq.enqueue(22);
      
      mq.print();
      
      mq.dequeue();
      
      mq.print();
  }
}


class MyQueue{
  int[]arr;
  int front,rear,size,capacity;
  
  MyQueue(int capacity){
    this.capacity = capacity;
   arr = new int [capacity]; 
   size = 0;
   front = 0;
   rear = -1;
   
  }
  
  void enqueue(int data){
   if (size == capacity){
     System.out.println("Queue is full");
     return;
   }
   
   rear = (rear+1)%capacity;
   arr[rear]=data;
   size++;
    
  }
  void print(){
    int start = front;
    while(start<=size){
      System.out.println(arr[start]);
      start++;
    }
      
  }
    
    
  void dequeue(){
    if (size == 0){
      System.out.println("Queue is empty");
     
    } 
    int result = arr[front];
    front = (front + 1)% capacity;
    size--;
    
  }
  
}