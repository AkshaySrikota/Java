public class multilevelinheritance {
    public static void main(String args[]){
Dolphin d1=new Dolphin();
d1.breath();
d1.jump();
d1.swim();
    }
    
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
