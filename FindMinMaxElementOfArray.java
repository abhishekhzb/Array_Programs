import java.util.*;

public class FindMinMaxElementOfArray {
    public static void main(String[] args) {
      
      int[] arr = {1,2,3,4,5,6,4,3,2,1};
      int min = arr[0];
      int max = arr[0];
      
      for(int a : arr){
        if(max<a){
           max = a;
        }
        if(min>a){
           min = a;
        }
      }
      
      System.out.println("Min : "+min);
      System.out.println("Max : "+max);
      
  }
}
