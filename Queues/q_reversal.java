import java.util.*;
public class q_reversal {
    public static void rev(Queue<Integer>q){//Tc =O(n)andSc=O(n)
        Stack<Integer>s=new Stack<>();
       /*  int size=q.size();
        for(int i=0;i<size;i++){
            s.push(q.remove());
        }
        for(int i=0;i<size;i++){
           q.add(s.pop());
           }*/
           while(!q.isEmpty()){
            s.push(q.remove());
           }
           while(!s.isEmpty()){
            q.add(s.pop());
           }
        }
    

    public static void main(String args[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        rev(q);
        System.out.println(q);

    }
}
