public class superkeyword {
    public static void main(String args[]){
     Horse h1=new Horse();
    }
    
}
class Animal{
    String name;
    Animal(){
        System.out.println("Animal ");
    
}}
class Horse extends Animal{
    
    Horse(){
        //super.name="fish";
        super();//java by defalut consider to implement this without typing this keyword//no need of super()
        System.out.println("Horse ");
    
}}