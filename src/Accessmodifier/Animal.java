package Accessmodifier;

public class Animal {
   protected void eat(){
       System.out.println("Animal is eating");

   }
}
class Dog extends Animal{
   void doeat(){
       eat();
   }
}
