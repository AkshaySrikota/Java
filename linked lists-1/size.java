public class size {
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

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
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

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
        }
        Node newNode=new Node(data);
        size++;
    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
     newNode.next=temp.next;
     temp.next=newNode;
    
    }
    public static void main(String args[]){
       size ll=new size();    
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.add(1,77);
       System.out.println(ll.size);
    }
    
}
