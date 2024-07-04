/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

import java.util.Collections;

/**
 *
 * @author Sanket Prajapati
 */

public class QuickSort{
    
    public static void qs(int arr[],int low,int high)
    {
        if (low < high)
        {
            int partition = function(arr, low, high);
            qs(arr, partition+1, high);
            qs(arr,low, partition-1);
        }
    }
    
    public static void printArray(int sortarr[])
    {
        System.out.println("Sorted Array: ");
        for(int i=0; i<sortarr.length;i++)
        {
            System.out.print(" "+sortarr[i]);
            
        }
        System.out.println("");
    }
    
    public static int function(int arr[], int low, int high)
    {
        int i = low;
        int j = high;
        int pivot = arr[low];
        
        while(i < j)
        {
            while (arr[i] <= pivot && i <= high-1) {
                i++;
            }
            
            while (arr[j] > pivot && j >= low+1) {
                j--;
            }
            
            if(i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }
    
    
    public static void main(String[] args) {
        int arr[] = {4,345,66,4466,45,44};
        int size = arr.length;
        int low = 0;
        qs(arr,low,size-1);
        printArray(arr);
    }
}