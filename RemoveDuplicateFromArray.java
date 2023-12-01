import java.util.*;

// Using HashSet removing duplicates.

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
    
    int[] a = {1,2,3,4,5,3,4,5};
    
    HashSet<Integer> set = new HashSet<>();
    
    for(int i=0;i<a.length;i++){
      set.add(a[i]);
    }
    
    System.out.println(""+set);
  } 
}
