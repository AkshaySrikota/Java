public class copyconstructors {
    public static void main(String args[]){
Intern say=new Intern();
say.name="Akshay";
say.roll=69;
say.password=243;
say.marks[0]=99;
say.marks[1]=98;
say.marks[2]=97;
for(int i=0;i<3;i++){
    System.out.println(say.marks[i]);
}
Intern ak=new Intern(say);//copied
ak.password=345;

System.out.println(ak.name);
System.out.println(ak.roll);
System.out.println(ak.password);
for(int i=0;i<3;i++){
    System.out.println(ak.marks[i]);
}

ak.marks[1]=100;//change
System.out.println(ak.marks[1]);
System.out.println(say.marks[1]);//we get changed value because we changed the address as array refrence is copied

    }
    
}
class Intern{
    String name;
    int roll;
    int password;
    int marks[];
    Intern(){
    }
    //Shallow copy constructor-here by refrence so change reflects
    Intern(Intern s1){
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
//deep copy constructor

//Intern(Intern s1){
  //  this.name=s1.name;
   // this.roll=s1.roll;
    //for(int i=0;i<marks.length;i++){
//  this.marks[i]=s1.marks[i];
   // }
//}
}