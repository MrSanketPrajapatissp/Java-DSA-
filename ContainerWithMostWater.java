/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;
import java.util.ArrayList;

/**
 *
 * @author Sanket Prajapati
 */
public class ContainerWithMostWater {
    
    public static int storeWater(ArrayList<Integer> list)
    { // Time Coplexity O(n^2)
        int maxWater = 0;
        for(int i=0; i<list.size();i++)
        {
            for(int j=i+1; j<list.size();j++)
            {
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int currWater = height * width;
                
                maxWater = Math.max(currWater,maxWater);
                
            }
        }
        
        return maxWater;
    }
    
    
    public static int StoreWater(ArrayList<Integer> list)
    {
        
        int maxWater = 0;
        int lp = 0;
        int rp = list.size() -1;
      
        while(lp < rp)
        {
            int ht = Math.min(list.get(lp),list.get(rp));
            int wd = rp - lp;
            int currWater = ht * wd;
            maxWater = Math.max(maxWater,currWater);
            
            if(list.get(lp) < list.get(rp))
            {
                lp++;
            }
            else{
                rp--;
            }
        }
        
        return maxWater;
    }
    
    public static void main(String[] args) {
       ArrayList<Integer> height = new ArrayList<>();
       height.add(1);
       height.add(8);
       height.add(6);
       height.add(2);
       height.add(5);
       height.add(4);
       height.add(8);
       height.add(3);
       height.add(7);
       
        System.out.println("Max Water with O(n^2) TC Container area is : "+storeWater(height));
        System.out.println("Max Water with O(n) TC Container area is : "+StoreWater(height));
       
    }
}
