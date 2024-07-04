/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

/**
 *
 * @author USER
 */

public class InsertionSort {
    
   public static void printArray(int arr[])
   {
       System.out.println("Sorted Elements are : ");
       for(int i=0;i<arr.length; i++)
       {
           System.out.println(" "+arr[i]);
       }
   }
    
    
    
    public static void main(String[] args)
    {
        int arr[] = {7,5,3,1,2};
        
        for(int i = 1; i<arr.length; i++)
        {
            int current = arr[i];
            int j = i-1;
                
            while(j >= 0 && current < arr[j])
            {
                arr[j+1]  = arr[j];
                j--;
                
            }
            
            // placement
            arr[j+1] = current;
        }
        printArray(arr);
    }
}
