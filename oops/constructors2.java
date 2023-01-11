public class constructors2 {
    public static void main(String args[]){
        student s1=new student("Akshay");
        System.out.println(s1.name);
    }
}
class student{
String name;
student(String name){
this.name=name;
}

}