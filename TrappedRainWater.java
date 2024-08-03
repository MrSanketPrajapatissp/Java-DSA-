/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author Sanket Prajapati
 */
public class TrappedRainWater {
    
    public static int trappedWater(int heightOfBar[])
    {
        int n = heightOfBar.length;
        
        int[] LeftMaxBou = new int[n];
        LeftMaxBou[0] = heightOfBar[0];
        
        for(int i = 1; i<n; i++)
        {
            LeftMaxBou[i] = Math.max(heightOfBar[i], LeftMaxBou[i-1]);
            
        }
               
        int[] RightMaxBou = new int[n];
        RightMaxBou[n-1] = heightOfBar[n-1];
        
        for(int i = n-2; i>=0; i--)
        {
            RightMaxBou[i] = Math.max(heightOfBar[i],RightMaxBou[i+1]);
        }
        
        int trappedWater = 0;
        // formulae : Waterheight - Barheight * Width (Width == 1)
        for(int i = 0; i<n; i++)
        {
            
            int WaterLevel = 0;
            WaterLevel = Math.min(LeftMaxBou[i], RightMaxBou[i]);
            int eachBarWatercontains = WaterLevel - heightOfBar[i]; 
            trappedWater += eachBarWatercontains;
        }
        
        return trappedWater;
    }
    
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        
        System.out.println("Trapped Water: "+trappedWater(arr));
    }
    
}
