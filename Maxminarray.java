/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

/**
 *
 * @author User
 */
public class Maxminarray {
    public static int setMini(int a[], int n)
    {
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(a[i] < mini)
            {
                mini = a[i];
            }
        }
        return mini;
    }
    
        public static int setMaxi(int a[], int n)
    {
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(a[i] > maxi)
            {
                maxi = a[i];
            }
        }
        return maxi;
    }
        
    public static void main(String args[])
    {
       int A[] = {12,34,5322,22,78,1};
       int N  = A.length;
        
   
       
        System.out.println("Minimum value in an Array: "+setMini(A,N));
             
        System.out.println("Minimum value in an Array: "+setMaxi(A,N));
    }
    
    
}
