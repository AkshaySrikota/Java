public class statickeyword {
    public static void main(String args[]){
        student s1=new student();
        s1.schoolName="Mv";
        student s2=new student();
        System.out.println(s2.schoolName);//MV
        student s3=new student();
        s3.schoolName="ABC";
        System.out.println(s1.schoolName);//Abc
        System.out.println(s2.schoolName);//ABC
        System.out.println(s3.schoolName);//ABC
    }
    
}
class student{
    String name;
    int sumofall;
    int noofall;
    static int permarks(int sumofall,int noofall){ 
        return (sumofall)/noofall;

}
    static String schoolName;   
    void setName(String name){
      this.name=name;  
    }
     
    String getName(){
      return this.name;  
    }
}

