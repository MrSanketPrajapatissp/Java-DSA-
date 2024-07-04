/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

/**
 *
 * @author USER
 */

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Element: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Enter x element to search: ");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("Array element found at index :" + i);

            }
        }

        System.out.println("Enter the location to delete the array element: ");
        int loc = sc.nextInt();

        for (int i = loc; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;

        System.out.println("Array Elements: ");
      
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }

}
