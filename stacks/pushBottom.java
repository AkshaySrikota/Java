import java.util.*;
public class pushBottom {
    public static void bot_push(Stack<Integer>s,int data){
        if(s.isEmpty()==true){
            s.push(data);
            return;
        }
        int top=s.pop();
        bot_push(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        bot_push(s,4);
        System.out.println(s);
       // while(!s.isEmpty()){ 
        //    System.out.println(s.pop());
        //}
        

    }
}
