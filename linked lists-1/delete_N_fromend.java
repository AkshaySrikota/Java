public class delete_N_fromend {
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
    
    
    public void remNEnd(int n){
        //calculate size of ll
        Node temp =head;
        int sz=0;
        while(temp!=null){
            temp=temp.next;
            sz++;
        } 
        //for removeFirst
        if(n==sz){
            head=head.next;
            return;
        }
        //find prev from start ==sz-n+1-1==sz-n
        int i=1;
        Node prev=head;
        while(i<sz-n){
           prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
     }


    public static void main(String args[]){
        delete_N_fromend ll=new delete_N_fromend();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printn();
        ll.remNEnd(2);
        ll.printn();
    }

    }

