import java.util.*;
public class by_JCF {
    
    public static void main(String args[]){
        //As Queue is Interface we use other classes to make objects

        //LinkedList class
        Queue<Integer>qll=new LinkedList<>();
        qll.add(1);
        qll.add(2);
        qll.add(3);
        while(!qll.isEmpty()){
            System.out.println(qll.peek());
            qll.remove();
        }
        //By Arraydeque class
        Queue<Integer>qarr=new ArrayDeque<>();
        qarr.add(1);
        qarr.add(2);
        qarr.add(3);
        while(!qarr.isEmpty()){
            System.out.println(qarr.peek());
            qarr.remove();
        }
    }
}
