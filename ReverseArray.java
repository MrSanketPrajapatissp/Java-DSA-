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
public class ReverseArray {
    public static void printArray(int[] arr)
    {
        for (int i =0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void reverse(int arr[]) {
        // TC = O(n) SC = O(1) or constant
        int start = 0, last = arr.length - 1;
        
        while(start < last)
        {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            
            start++;
            last--;
        }
        
    }
    
    public static void subArrays(int arr[])
    {
        int ts = 0;
        for(int i = 0; i<arr.length; i++)
        {
            int start = i;
            for(int j = i; j < arr.length; j++)
            {
                int end = j;
                for(int k = start; k<=end; k++)
                {
                    System.out.print(" "+arr[k]);
                   
                }
                System.out.println();
                 ts++;
            }
        }
        System.out.println("Total Subarrays: "+ts);
    }
    
    public static void pairsArray(int arr[])          
    {
        int tp  = 0, current;
        for(int i = 0; i<arr.length; i++)
        {
            current = arr[i];
            for(int j = i+1; j<arr.length; j++)
            {
                System.out.print("("+current+","+arr[j]+")");
                 tp++;
                
            }
            System.out.println();
          
        }
        System.out.println("Total pairs: "+tp);
    }
    
    public static void maxSubArraySumOptimize(int arr[])
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        
        for(int i = 1; i<arr.length; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }
        
        for(int i = 0; i< arr.length; i++)
        {   
            int start = i;
            for(int j = i; j< arr.length; j++)
            {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(currSum > maxSum)
                {
                    maxSum = currSum;
                }
                
            }
        }
        System.out.println("Max SUM : "+maxSum);
    }
    
    public static void maxSubArraySum(int arr[])
    {
        // Time complexity = O(n^3)
        int maxSum = Integer.MIN_VALUE;
        
        for(int i = 0; i<arr.length; i++)
        {
            int start  = i;
            for(int j = i; j< arr.length; j++)
            {
                int currSum = 0;
                int end = j;
                for(int k = start; k<=end; k++)
                {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(currSum > maxSum)
                {
                    maxSum  = currSum;
                }
            }
        }
        
        System.out.println("Maximum subarray sum is : "+maxSum);
        
    }
    
    public static void kadanes(int arr[])
    {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        
        boolean allnegative = true;
        int minNegNum = Integer.MIN_VALUE;
        for(int num: arr)
        {
            if(num > minNegNum)
            {
                minNegNum = num;
            }
            
            if(num >= 0)
            {
                allnegative = false;
                break;
            }
            
        }
        
        if(allnegative){
            System.out.println("Our maximum subarray sum is : "+minNegNum);
            System.out.println(""+allnegative);
        }
        else
        {
            for(int i = 0; i<arr.length; i++)
            {
                cs = cs + arr[i];
                if(cs < 0)
                {
                    cs = 0;
               
                }
                ms = Math.max(cs, ms);
            
            }
            System.out.println("Our Max subarray sum is : "+ms);    
        }
        
    }
    
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
//        reverse(arr);
//        printArray(arr);
//        pairsArray(arr);
//        subArrays(arr);
//          maxSubArraySum(arr);
//          maxSubArraySumOptimize(arr);
          kadanes(arr);
    }
}
