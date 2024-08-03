/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Sanket Prajapati
 */
public class HierarchicalInheritance {
    
    public static void main(String[] args) {
        Dog dg1 = new Dog();
        dg1.bark();
        dg1.eat();
        
        Fish f1 = new Fish(4);
        f1.name = "shark";
        f1.swim();
        System.out.println("Fish Fins count: "+f1.fins);
    }
}

class Animal {
    String name;
    
    void eat()
    {
        System.out.println("eating");
    }
}

class Dog extends Animal{
    
    String Breed;
    
    void bark()
    {
        System.out.println("can bark");
    }
}

class Fish extends Animal{

    int fins;
    
    public Fish(int fins) {
        this.fins = fins;
    }
    
    void swim()
    {
        System.out.println("Can Swim");
    }
}
