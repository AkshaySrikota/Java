public class ispal {
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
    
    public Node mid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2

        }
        return slow;//slow==mid
    }
    public Boolean isPalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        //find mid
        Node midNode=mid(head);
        //reverse @nd half
        Node curr=midNode;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;//right half head
        Node left=head;//left half head
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }

    public static void main(String args[]){
       ispal ll=new ispal();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printn();
        System.out.println(ll.isPalindrome());
    }
    
}
