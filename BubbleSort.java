/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

/**
 *
 * @author USER
 */

public class BubbleSort{
    
    public static void printArray(int arr[])
    {
        System.out.println("Sorted Elements in Array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {7,3,8,2,1};
        
        // bubble sort time complexity 0(n^2)
        for(int i=0; i<arr.length-1;i++) // n-1
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        printArray(arr);
    }
}