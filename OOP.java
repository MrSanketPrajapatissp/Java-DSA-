/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

/**
 *
 * @author Sanket Prajapati
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("yellow");
        p1.setTip(2);
        System.out.println("Color: "+p1.color);
        System.out.println("Tip: "+p1.tip);
        p1.color = "Blue";
        p1.tip = 3;
        System.out.println("Color: "+p1.color);
        System.out.println("Tip : "+p1.tip);
        
        BankAccount cust1 = new BankAccount();
        cust1.username = "OM@123";
        System.out.println("Username: "+cust1.getUsername());
        System.out.println("Password: "+cust1.getPassword());
        cust1.setPassword(456353);
        System.out.println("Username: "+cust1.getUsername());
        System.out.println("Password: "+cust1.getPassword());

    }
    
}


class Student{

    int rollno;
    String name;
    int marks[];
    
    
    public Student() {
        marks = new int[3];
    }
    
    public Student(String name,int rollno)
    {   marks = new int[3];
        this.name = name;
        this.rollno = rollno;
    }
    // shallow copy constructor
    /*
    public Student(Student s1)
    {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks = s1.marks;
    }
    */
    // deep copy constructor
    
    public Student(Student s1)
    {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        
        for(int i = 0; i<marks.length; i++)
        {
            this.marks[i] = s1.marks[i];
        }
    }
    
    public Student(int rollno)
    {
        marks = new int[3];
        this.rollno = rollno;
    }
    
    
    public static void main(String[] args) {
        Student s1 = new Student("Sanket",61);
        System.out.println("Name : "+s1.name);
        System.out.println("Roll NO : "+s1.rollno);
        s1.marks[0] = 90;
        s1.marks[1] = 100;
        s1.marks[2] = 89;
        
        Student s2 = new Student(s1);
        System.out.println("Name : "+s2.name);
        System.out.println("Roll NO : "+s2.rollno);
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;
        for(int i = 0; i<s2.marks.length; i++)
        {
            System.out.println("marks of "+i+" :"+s2.marks[i]);
        }
    }
}



class BankAccount{
    String username;
    private int password;
    
    void setPassword(int pass)
    {
        password = pass;
    }
    
    void setUsername(String username)
    {
        this.username = username;
    }
    
    int getPassword()
    {
        return password;
    }
    
    String getUsername()
    {
        return username;
    }
    
}

class Pen{
    String color;
    int tip;
    
    public void setColor(String color)
    {
        this.color = color;     
    }
    
    public void setTip(int size)
    {
        tip = size;
    }
        
}
