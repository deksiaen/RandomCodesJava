/*********************************************************************************************************************************************
   Interface - is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a class.
               A Java interface contains static constants and abstract methods. The interface in Java is a mechanism to achieve abstraction.
             - outline for a class
***********************************************************************************************************************************************/
interface WaterBottleInterface{
   String color = "Blue";
   
   void fillUp(); // interface method (does/should not have a body)
}

public class Interface implements WaterBottleInterface{
   public static void main(String[] args){
      System.out.println(color);
      
      Interface dexie = new Interface();
      dexie.fillUp();
   }
   public void fillUp(){ //the body which provided by the "implement" class
      System.out.println("It is filled");
   }
}