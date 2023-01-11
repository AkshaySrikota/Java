public class typesofconstructors {
    public static void main(String args[]){
Students s1=new Students();
Students s2=new Students(9);
Students s3=new Students("Akshay");
System.out.println(s3.name);
System.out.println(s2.grade);
    } 
}
class Students{
    String name;
    int grade;
    Students(){
System.out.println("Constructor activated");
    }
    Students(int grade){
this.grade=grade;
    }
    Students(String name){
this.name=name;
    }

}