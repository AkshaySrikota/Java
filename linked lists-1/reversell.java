public class reversell {
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

    public void revll(){//O(n)  #variables,4steps
        Node curr=head;
        Node prev=null;
        Node next;
        tail=head;

        while(curr!=null){
            
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String args[]){
        reversell ll=new reversell();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printn();
        ll.revll();
        ll.printn();
    }
    
}
