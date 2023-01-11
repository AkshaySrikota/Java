public class getterandsetters {
    public static void main(String args[]){
        Pen p1=new Pen();//created pen object called p1
        p1.setcolour("blue");
    p1.settip(3);
    System.out.println(p1.getcolour());
    System.out.println(p1.gettip());
    p1.setcolour("yellow");
    System.out.println(p1.getcolour());

}
    }
    class Pen {
    private String colour;
    private int tip;
    //getters
     String getcolour(){
        return this.colour;
     }
     int gettip(){
        return this.tip;
     }
    //setters
    void setcolour(String newcolour){
    this.colour=newcolour;
    }

    void settip(int tip){
        this.tip=tip;
        }


}
