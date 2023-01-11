public class Hybridinheritance {
   Bird b1=new Bird();
   
   Dolphin d1=new Dolphin();
    

}
//Base/parent class
class Animal{
    String colour;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
//sub/child/Derived class
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
    int fings;

}
//Derived class-which is derived from above derived class
class Dolphin extends Fish{
    int size;
    void jump(){
        System.out.println("jumps");
    }
}
//sub/child/Derived class-from base classAnimal
class Bird extends Animal{
    void fly(){
        System.out.println("flys");
    }

}