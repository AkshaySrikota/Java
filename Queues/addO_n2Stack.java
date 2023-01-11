import java.util.*;
public class addO_n2Stack {
    static class Queue{
static Stack<Integer>s1=new Stack<>();
static Stack<Integer>s2=new Stack<>();

public static Boolean isEmpty(){
return s1.isEmpty();
}

//add
public static void add(int data){
while(!s1.isEmpty()){
    s2.push(s1.peek());
    s1.pop();
}
s1.push(data);
while(!s2.isEmpty()){
    s1.push(s2.peek());
    s2.pop();
}
}
//remove
public static int remove(){
    if(isEmpty()){
        System.out.println("empty");
        return -1;
    }
    return s1.pop();
}
//peek
public static int peek(){
    if(isEmpty()){
        System.out.println("empty");
        return -1;
    }
    return s1.peek();
}
}


    public static void main(String args[]){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.peek());
        
    }
}
