/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 * The below code shows the Multilevel Inheritance:
 * @author Sanket Prajapati
 */
public class Inheritance {
    
    public static void main(String[] args)
    {
        Mammel typeAnimal = new Mammel();
        typeAnimal.eat();
        Dog dg1 = new Dog();
        dg1.eat(); // calling base class method from subclass
        dg1.name = "Champ";
        dg1.Breed = "Rotwiller";
        
        System.out.println("Name of Dog: "+dg1.name);
        System.out.println("Breed of Dog: "+dg1.Breed);
    }
}

class Animal {
    String name;
    
    void eat()
    {
        System.out.println("eating");
    }
}

class Mammel extends Animal{

    void live()
    {
        System.out.println("Mostly living on Ground");
    }
    
    void Birth()
    {
        System.out.println("Can give birth");
    }
}

class Dog extends Mammel{
    
    String Breed;
    
    
}