public class singlelevelinheritance {
    public static void main(String args[]){
        Fish Shark=new Fish();
        Shark.breath();
        Shark.fings=4;
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