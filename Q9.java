//Write a Java program to remove elements from an ArrayList

package P1;


import java.util.ArrayList;  

public class Q9 {  
   public static void main(String[] args) {  
      // creating an ArrayList having default size 5  
      ArrayList<String> arr = new ArrayList<String>(5);  
      // Adding elements to the ArrayList  
      arr.add("Raony");  
      arr.add("Ram");  
      arr.add("Sir");  
      arr.add("Para");  
      System.out.println("The list of the size is: " + arr.size());  
      // Showing all the elements in the ArrayList  
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }    
      // Removing element available at position 1  
      arr.remove(1);  
      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
      // Showing all the elements in the ArrayList  
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }  
   }  
}  