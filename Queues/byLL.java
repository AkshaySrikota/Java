public class byLL {
   static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null; 
        //isEmpty
        public static Boolean isEmpty(){
            return head==null&&tail==null;
        }
        //add
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            int front=head.data;
            //single element
            if(head==tail){
                head=tail=null;
            }else{ 
            head=head.next;}
            return front;
        }

    }
    public static void main(String args[]){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
