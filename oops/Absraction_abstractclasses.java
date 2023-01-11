public class Absraction_abstractclasses {
    public static void main(String args[]){
//Animal a1=new Animal();//shows wrror because abstract classes can't create object

 
Horse h1=new Horse();

h1.walk();
Chicken c1=new Chicken();
c1.eats();
c1.walk();
//use of abstract constructor
//can't create a object but assigns particular stuff/variable values  to child classes
//color of horse and Chicken is by default browm due to abstract constructor


    }
    
}
abstract class Animal{
    String color;
    //use of constructor to assign a particular colour/size to all sub classes etc..
Animal(){
    System.out.println("Animal constructor activated");
    color="brown";
}
void eats(){
    System.out.println("animal eats");
}
abstract void walk();//abstract classes can't implement but gives idea walk to subclasses/child classes
}

//class Cat extends Animal{

//}
//gives red line on cat i.e error we have to implement abstract function complasary
class Horse extends Animal{
    void walk(){
        System.out.println(" walks on 4 legs");
    }
}
class Chicken extends Animal{
    void changecolor(){
this.color="White";
    }
    void walk(){
        System.out.println(" walks on 2 legs");
    }
}