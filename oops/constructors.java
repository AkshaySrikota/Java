public class constructors {
    public static void main(String args[]){
        Check con=new Check();
       
    graduate say=new graduate("Akshay");
    //don't know why i can't use 2 constructors of diffrent classes
    //create unique name of classes than Your previous code in files
//Ex: I created a first file "constructor1" in a folder "OOPS" and created a class named "student" and in another file "constructor2" in same folder I created a same class "student"
//This lead to error that you mentioned 
//Just use different names of classes.   
    }
}
class Check{
    int name;
    Check(){  
        System.out.println("constructor activated")
    }  
}
class graduate{
    int marks;
    String name;

    //constructor creation
    graduate(String name){
        this.name=name;
        System.out.println("graduate.graduate()");
    }
}

