import java.util.*;

public class Histogram {
    public static void main(String[] args) {
      
      int[] heights ={1,2,6,3};
      Stack<Integer> st =new Stack<Integer>();
      
      int maxAera =0;
      int n=heights.length;
      
      for(int i=0;i<=n;i++){
        int currentHeight = i==n ? 0 : heights[i];
        
        while(!st.isEmpty() && currentHeight<heights[st.peek()]){
          int height = heights[st.pop()];
          int width = st.isEmpty() ? i : (i-st.peek()-1);
          maxAera = Math.max(maxAera,height*width);
        }
        st.push(i);
      }
      System.out.println(maxAera);
  }
}