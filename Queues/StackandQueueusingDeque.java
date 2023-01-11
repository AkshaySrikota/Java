import java.util.*;
public class StackandQueueusingDeque {
    static class Stack{
      static  Deque<Integer>dq=new LinkedList<>();
        //isEmpty
        public static Boolean isEmpty(){
            return dq.isEmpty();
        }
        //push
        public static void push(int data){
            dq.addLast(data);
        }
        //pop
        public static int pop(){
          return  dq.removeLast();
        } 
       //peek
       public static int peek(){
        return  dq.getLast();
      } 
    }
    static class Queue{
        static  Deque<Integer>dq=new LinkedList<>();
        //isEmpty
             //isEmpty
             public static Boolean isEmpty(){
                return dq.isEmpty();
            }
            //add
            public static void add(int data){
                dq.addLast(data);
            }
            //remove
            public static int remove(){
              return  dq.removeFirst();
            } 
           //peek
           public static int peek(){
            return  dq.getFirst();
          } 
    }


    public static void main(String args[]){
        Stack s=new Stack();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        
        System.out.println(s.pop());
        System.out.println(s.peek());

        Queue q=new Queue();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        System.out.println(q.peek());


    }
}
