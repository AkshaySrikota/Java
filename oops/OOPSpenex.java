public class OOPSpenex {

public static void main(String args[]){
    Pen p1=new Pen();//created pen object called p1
    p1.setcolour("blue");
p1.settip(3);
System.out.println(p1.colour);
System.out.println(p1.tip);
p1.colour="yellow";
System.out.println(p1.colour);
}
}
class Pen {
String colour;
int tip;
void setcolour(String newcolour){
colour=newcolour;
}
void settip(int newtip){
    tip=newtip;
    }
    
}
