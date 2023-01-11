public class addll {
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

    public void addFirst(int data){
        Node newNode=new Node(data);
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

    public void addLast(int data){
        Node newNode=new Node(data);
        //null node
        if(head==null){
            head=tail=newNode;
            return;
        }
        // newNode becomes refernce to previous tail and next of newNode node is null 
        tail=newNode.next;
        //change tail to nnhead
        tail=newNode;
    }  

    public static void main(String args[]){
    addll ll=new addll();    
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addLast(3);
        
    }
}
