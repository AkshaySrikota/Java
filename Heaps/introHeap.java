import java.util.*;
public class introHeap {
    static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();
        public void add(int data){//O(logn)
            //add at last idx
            arr.add(data);
        
            int x=arr.size()-1;//x is child index
            int par=(x-1)/2;//par index

            while(arr.get(x)<arr.get(par)){//O(levels)=O(logn)
                //swap
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2;
            }

        }
        public  int peek(){
            return arr.get(0);
        }
        public void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;

            int minIdx=i;
            if(left<arr.size()&&arr.get(minIdx)>arr.get(left)){
                minIdx=left;
            }
            if(right<arr.size()&&arr.get(minIdx)>arr.get(right)){
                minIdx=right;
            }
            if(minIdx!=i){
                //swap
                int temp=arr.get(minIdx);
                arr.set(minIdx,arr.get(i));
                arr.set(i,temp);
                heapify(minIdx);
            }
        }
      public int remove(){
        //swap 1st and last
        int data=arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1,data);

        //delete last
        arr.remove(arr.size()-1);

        //heapify
        heapify(0);
        return data;
      } 
      public Boolean isEmpty(){ 
       /*  if(arr.size()==0){
            return true;
        }
        else{
            return false;
        }*/
      return arr.size()==0;
    }}

    public static void main(String args[]){
        Heap h=new Heap();//same as Piority Queues in Jcf
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5); 

        while(!h.isEmpty()){//heap sort-O(nlogn)
            System.out.print(h.peek()+" ");
            h.remove();
        }
    }
}
