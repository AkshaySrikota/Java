public class removell {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        //null node
        if(head==null){
            head=tail=newNode;
            return;
        }
        //nnnext==head   refernce to previous head
        newNode.next=head;
        //change head to nnhead
        head=newNode;
    }  
    public void printn(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp =head;
        while(temp!=null){  
        System.out.print(temp.data);
        temp=temp.next;
    }System.out.println();
    }
    public  void removeFirst(){
        if(size==0){
            System.out.println("empty can't remove anything");
            return;
        }
        if(size==1){//change both head and tail
            head=tail=null;
            size=0;
            return;
        }
        head=head.next;
        size--;
    }
    public void removeLast(){
        if(size==0){
            System.out.println("empty can't remove anything");
            return;
        }
        if(size==1){//change both head and tail
            head=tail=null;
            size=0;
            return;
        }
        Node temp=head;
        int i=0;
        while(i<size-2){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }


    public static void main(String args[]){
       removell ll=new removell();    
         ll.addFirst(3);
         ll.addFirst(2);
         ll.addFirst(1);
         ll.printn();
         ll.removeFirst();
         ll.printn();
         ll.removeLast();
         ll.printn();
         System.out.println(size);
        
     }
}
