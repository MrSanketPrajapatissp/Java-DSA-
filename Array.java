/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author Sanket Prajapati
 */

import java.util.*;
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        
        System.out.println("marks array length: "+marks.length);
        
        System.out.println("Enter Marks of Three Subjects: ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        
        
        
        System.out.println("marks[0]: "+marks[0]);
        System.out.println("marks[1]: "+marks[1]);
        System.out.println("marks[2]: "+marks[2]);
        
        for(int i = 0; i<marks.length; i++)
        {
            System.out.print(+marks[i]+" ");
        }
        
        System.out.println();
        
        // to update marks of 3rd subject : access by indexes
        
        marks[2] = marks[2] + 45;
        System.out.println("Marks of Third Subject: "+marks[2]);
    }
    
}
