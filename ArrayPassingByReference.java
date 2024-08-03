/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 * Array is the Call by REFERENCE therefore upadation done in array in local function affects the array in main functions
 * others variable are pass by arguments here changeable not affected in main function however its updated in local functions
 * @author Sanket Prajapati
 */
public class ArrayPassingByReference {
    public static void updateValues(int marks[],int changeable)
    {
        changeable = 10;
        for(int i = 0; i<marks.length; i++)
        {
            marks[i] = marks[i] + 1;
         }
    }
    public static void main(String[] args) {
        int marks[] = {95,98,98};
        int changeable = 5;
        updateValues(marks,changeable);
        
        for(int i = 0; i<marks.length; i++)
        {
            System.out.print(marks[i]+" ");
        }
        
        System.out.println();
        System.out.println("Changeable not affected in main function : "+changeable);
    }
}
