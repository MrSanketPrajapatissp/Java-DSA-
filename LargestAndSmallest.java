/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;
import java.util.*;
/**
 *
 * @author Sanket Prajapati
 */
public class LargestAndSmallest {
    
    public static void largestAndSmallest(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for(int i = 0; i<arr.length; i++) // O(n)
        {
            if(largest < arr[i])
            { 
                largest = arr[i];
            }
            if(smallest > arr[i])
            {
                smallest = arr[i];
            }
        }
        
        System.out.println("Largest number in an array: "+largest);
        System.out.println("Smallest number in an array: "+smallest);
    }
    
    public static int LinearSearch(int arr[], int key)
    {
        for(int i = 0; i < arr.length; i++) // O(n)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public LargestAndSmallest() {
    }
    
    public static int BinarySearch(int arr[],int key)
    { // Time Complexity : log n  // n -> n/2 -> n/4 -> n/8 
        int start = 0, end = arr.length -1;
     
        while(start <= end)
        {
             int mid = (start + end) / 2;
              
             if(arr[mid] == key)
             {
                 return mid;
                                
             }else if(arr[mid] > key) // Discard Right part
             {
                 end = mid -1;
             }
             else // mid < key Discard Left part
             {
                 start = mid + 1;
             }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {12,34,35,56,76};
        int key = 12;
        int index = LinearSearch(arr,key);
        
        if(index != -1)
        {
            System.out.println("Key is found at index: "+index);
        }else{
            System.out.println("Key is not Found");
        }
        largestAndSmallest(arr);
        
        System.out.println("key is found at index : "+BinarySearch(arr, key));
        
    }
}

