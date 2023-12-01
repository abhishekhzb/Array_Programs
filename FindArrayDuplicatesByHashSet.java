import java.util.*;

// Using HashSet find duplicates.

public class FindArrayDuplicatesByHashSet {
    public static void main(String[] args) {
    
    int[] a = {1,2,3,4,5,3,4,5};
    
    Set<Integer> hashSet = new HashSet<Integer>();
    
    for(int i = 0;i<a.length;i++){
       if(hashSet.add(a[i])==false){
         System.out.println(""+a[i]);
       }
    }
    
  } 
}
