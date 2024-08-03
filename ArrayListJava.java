/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

/**
 *
 * @author Sanket Prajapati
 */
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListJava {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);

        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }

    public static int getMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);

            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);  // O(1)
        list.add(3);
        list.add(4);
        list.add(5);

//        System.out.println(" "+getMax(list));
        System.out.println(" " + list);
        swap(list, 1, 3); // 1 2 3 4 5 -> 1 4 3 2 5
        System.out.println(" " + list);
        System.out.println("Unsorted List: "+list);
        Collections.sort(list);
        System.out.println("Sorted list: "+list);
        
        Collections.sort(list, Collections.reverseOrder()); // Comparator Fnx = logic for sorting in which order
        System.out.println("Sorting list in descending order: "+list);
        
        // list.set(2, 9);

        // list.add(1,10);   // O(N)
//        System.out.println(list.size());
//        
//        for(int i= 0; i<list.size(); i++)
//        {
//            System.out.print(" "+list.get(i));
//        }
//        
//        System.out.println("Reverse the arraylist: ");
//        for(int i = list.size()-1; i >= 0; i--)
//        {
//            System.out.print(" "+list.get(i));            
//        }
//        System.out.println("Element: "+element);
//        System.out.println("11 contains: "+list.contains(11));
//        list.remove(2);   // O(n)
//        System.out.println(list);
//        
    }
}


