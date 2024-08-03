/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;
import java.util.*;
/**
 *
 * @author Sanket Prajapati
 */
public class PairSumArrayListSortedAndRotated {
    
    public static boolean isPairExits(ArrayList<Integer> list, int target)
    {
        int bp = -1;
        int n = list.size();
        
        for(int i = 0; i<n; i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                bp = i;
                break;
            }
        }
        
        int rp = bp;      // largest
        int lp = bp + 1;   // smallest
        
        while(lp != rp)
        {
            if(list.get(lp) + list.get(rp) == target)
            {
                return true;
            }else if(list.get(lp) + list.get(rp) < target)
            {
                lp = (lp + 1) % n;
            }
            else
            {
                rp = (n+ rp - 1 ) % n;
                
            }  
            
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(16);
        list.add(18);
        list.add(1);
        list.add(2);
        list.add(3);
        
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Target: ");
         int target = sc.nextInt();
         System.out.println("is Pair found: "+isPairExits(list, target));
    }
    
}
