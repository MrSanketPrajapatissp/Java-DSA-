/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

import java.awt.BorderLayout;
import java.util.ArrayList;

/**
 *
 * @author Sanket Prajapati
 */
public class Parisumproblem1onArrayList {
    public static boolean isPairExists(ArrayList<Integer> list, int target)
    {  // Time complexity = O(n^2)
        for(int i=0; i<list.size(); i++)
        {
            for (int j= i+1; j<list.size(); j++)
            {
                if(list.get(i) + list.get(j) == target)
                {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static boolean IspairExists(ArrayList<Integer> list, int target)
    {
        // Time complexity O(n)
        int lp = 0;
        int rp = list.size() - 1;
        
        while(lp != rp)
        {
            if(list.get(lp) + list.get(rp) == target)
            {
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target)
            {
                lp++;
            }
            else 
            {
                rp--;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 50;
        System.out.println("Sum 5 pair is Exists: "+isPairExists(list, target));
        System.out.println("Sum 5 pair is Exists: "+IspairExists(list, target));
    }
}
