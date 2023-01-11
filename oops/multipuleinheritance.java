public class multipuleinheritance {
    public static void main(String args[]){
        Bear b=new Bear();
        b.eatsgrass();
        b.eatsmeat();
        
    }
}
interface Herbivors{
    void eatsgrass();
}
interface Carnivors{
    void eatsmeat();
}
class Bear implements Herbivors,Carnivors{
    public void eatsgrass(){
       System.out.println("Bear eatsgrass");
    }
     public void eatsmeat(){
        System.out.println("Bear eatsmeat");
    }

}