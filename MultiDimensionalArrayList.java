/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;
import java.util.ArrayList;
import java.util.AbstractCollection;
/**
 * IMP
 * @author Sanket Prajapati
 */
public class MultiDimensionalArrayList {
    
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> manifest = new ArrayList<>();
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        
        for(int i=1; i<=5; i++)
        {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        
        manifest.add(list1);
        manifest.add(list2);
        manifest.add(list3);
        
        System.out.println("Manifest Multi-Dimensional ArrayList in Java: "+manifest);
        
        for(int i=0; i<manifest.size(); i++)
        {   
            ArrayList<Integer> currList = manifest.get(i);
            
            for(int j = 0; j<currList.size(); j++)
            {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
            
        }
                
    }
}
