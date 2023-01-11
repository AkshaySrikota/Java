import java.util.*;
public class Interleave_2halfqueue {
    public static void interLeave(Queue<Integer>q){//O(n)=tcandsc
        Queue<Integer>firsthalf=new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            firsthalf.add(q.remove());
        }
       while(firsthalf.isEmpty()==false){
       /*int first_ele= firsthalf.remove();//remove first_half_element
        q.add(first_ele);
        int second_ele=q.remove();//remove fromoriginal second half elemnet
        q.add(second_ele);*/
        q.add(firsthalf.remove());
        q.add(q.remove());
       }

    }


    public static void main(String args[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
        System.out.println(q);

    }
}
