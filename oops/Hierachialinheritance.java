public class Hierachialinheritance {
    public static void main(String args[]){
Bird sparrow=new Bird();
sparrow.breath();
sparrow.fly();
sparrow.eat();
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
//sub/child/Derived class-from base classAnimal
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
    int fings;

}
//sub/child/Derived class-from base classAnimal
class Mammel extends Animal{
    void walk(){
        System.out.println("walks");
    }

}
//sub/child/Derived class-from base classAnimal
class Bird extends Animal{
    void fly(){
        System.out.println("flys");
    }

}