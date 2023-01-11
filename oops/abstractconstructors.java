public class abstractconstructors {
    public static void main(){
        Chicken c1=new Chicken();
        
    
    }
}
abstract class Animal{

    Animal(){
        System.out.println("Animal constructor called");
    }
}
class Horse extends  Animal{

    Horse(){
        System.out.println("Horse constructor called");
    }
}
class Chicken extends  Animal{

    Chicken(){
        System.out.println("Chicken constructor called");
    }
}