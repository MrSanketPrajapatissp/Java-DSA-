/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author Sanket Prajapati
 */
public class SetMatrixZero {
    
    public static void setZero(int matrix[][])
    {
        int m = matrix.length; // row size
        int n = matrix[0].length; // column size
        System.out.println("n: "+n);
    }
    
    public static void main(String[] args) {
        int matrix[][] = new int[4][2];
        setZero(matrix);
    }
}
