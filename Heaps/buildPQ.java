import java.util.Comparator;
import java.util.PriorityQueue;
public class buildPQ{

    public static void main(String args[]){
 //priority like ranks== smalll first        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(3);//O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        System.out.println(pq);//first elemnt adjust in highest priority
        while(!pq.isEmpty()){
            System.out.print(pq.peek());//O(1)
            pq.remove();//O(logn)
        }
        System.out.println();

//reverse order of ranks like percentage
            PriorityQueue<Integer>pqrev=new PriorityQueue<>(Comparator.reverseOrder());
            pqrev.add(3);//O(logn)
            pqrev.add(4);
            pqrev.add(1);
            pqrev.add(7);
    
            System.out.println(pqrev);//first elemnt adjust in highest priority
            while(!pqrev.isEmpty()){
                System.out.print(pqrev.peek());//O(1)
                pqrev.remove();//O(logn)  
            }
        }      
        
    }
