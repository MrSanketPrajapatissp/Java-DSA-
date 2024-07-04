
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

/**
 *
 * @author USER
 */
public class SelctionSort {
    
    public static void printArray(int arr[])
    {
        System.out.println("Sorted Elements in an Array are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }
    
    public static void main(String[] args)
    {
        int arr[]= {7,8,3,1,2};
        
        for(int i = 0; i<arr.length-1; i++)
        {
            int smallest = i;
            
            for(int j = i + 1; j<arr.length;j++)
            {
                if (arr[smallest] > arr[j])
                {
                    smallest = j;
                }
            }
             
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        
        printArray(arr);
    }
}
