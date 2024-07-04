/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
public class ArrayListpractice {
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
            if (max < list2.get(i))
            {
                max = list2.get(i);
            }
////            max = Math.max(max,list2.get(i));
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i < list2.size();i++)
        {
            if(min > list2.get(i))
            {
                min = list2.get(i);
            }
        }
        
        System.out.println("max : "+max);
        System.out.println("min : "+min);        
    }
}

class ArrayListSwap{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(6);
        list.add(9);
        
        Collections.swap(list, 0, 0);
    }
}