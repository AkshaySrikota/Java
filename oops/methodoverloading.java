public class methodoverloading {
   public static void main(String args[]){
    cal q1=new cal();

    System.out.println(q1.sum(3,4));
    System.out.println(q1.sum(3,4,5));
    System.out.println(q1.sum((float)3.5,(float)4.3));
   } 

}
class cal{
    int sum(int a,int b){
return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
            }  
}