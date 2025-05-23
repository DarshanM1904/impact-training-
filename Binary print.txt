import java.util.*;
public class NewClass1 {

 public static void main(String[]args){
   
   //1=10
   //2=10
   //3=11
   //4=100
   //5=101
   
   Queue<String> qu = new LinkedList<String>();
   qu.add("1");
   
   int n =10;
   
   for(int i=1;i<n;i++){
     String front = qu.poll();
     System.out.println(front);
     
     qu.add(front+"0");
     qu.add(front+"1");
   }
 }

}