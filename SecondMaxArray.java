import java.util.*;

public class SecondMaxArray {
    public static void main(String[] args) {
      
     int[] arr = {1,2,3,4,5,6,10,9,12};
     
     int max = arr[0];
     int secondmax = 0;
     
     for(int a : arr){
       if(max<a){
          secondmax = max;
          max = a;
       } 
     }
      
     System.out.println(max);
     System.out.println(secondmax);
      
  }
}
