/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

/**
 *
 * @author Sanket Prajpati
 */
import java.util.ArrayList;
public class ArrayListImplementation {
    
public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println("The element in the list : "+list);
        // get element at index 4
        int element = list.get(4);
        System.out.println(element);
        
        // Delete element at index 3
//        list.remove(3);
//        System.out.println(list);
        
        // set element at index 3
        
//        list.set(3,10);
//        System.out.println(list);
        
        System.out.println(list.contains(2));
    }
}

 class ArrayListImplementation2 extends ArrayListImplementation{
    
     public static void main(String[] args) {
         ArrayList<String> list1 = new ArrayList<>();
         list1.add("Sanket");
         list1.add("Pratham");
         list1.add("Hakirat");
         list1.add("Vrushab");
         list1.add("Bhushan");
         
         System.out.println("list elements: "+list1);
         String element = list1.get(2);
         System.out.println("List Element at index 2: "+element);
         list1.remove(2);
         System.out.println("List: "+list1);
         list1.set(3, "Ramesh");
         System.out.println("List: "+list1);
         System.out.println("list1 contains Ramesh "+list1.contains("Ramesh"));
         
         for(int i = 0; i<list1.size(); i++)
         {
             System.out.println("List Element at "+i+" is: "+list1.get(i));
         }
         
     }
}


class ArrayListImplementation3{
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(1);
        list2.add(5);
        list2.add(8);
        list2.add(45);
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<list2.size(); i++)
        {
            if (max > list2.get(i))
            {
                max = list2.get(i);
            }
//            max = Math.max(max,list2.get(i));
        }
        
        int min = Integer.MIN_VALUE;
        
        for(int i=0; i<list2.size();i++)
        {
            if(list2.get(i) < min)
            {
                min = list2.get(i);
            }
        }
        
        System.out.println("max : "+max);
        System.out.println("min : "+min);        
    }
}
