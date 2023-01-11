public class ascsessmodifiers {
    public static void main(String args[]){
      Bankaccount MyAcc =new Bankaccount();
      MyAcc.username="Akshay";
      //MyAcc.password="123";
      //System.out.println(password);
      MyAcc.getPassword();//we can get password by appling this function crreated in class
MyAcc.setPassword("Akshay@123");
//System.out.println(MyAcc.password);//can't access password as it is private
MyAcc.getPassword();

    }
    }
    
    class Bankaccount {
        public String username;
     private String password="Srikota Akshay";
     
     public void setPassword(String pwd){
        password ="pwd";
     }
     public void getPassword(){
        System.out.println(password);
     }
    }
    

