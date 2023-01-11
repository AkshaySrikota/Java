public class searchll {
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

    public int searchiter(int key){//O(n)
        Node temp=head;
        for(int i=0;temp!=null;i++){
            if(key==head.data){
                return i;
            }
            head=head.next;
        }
        return -1;
    }
    public int helper(int key,Node head){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(key,head.next);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }
    public int searchrecc(int key){
        return helper(key,head);//O(n)
    }

    public static void main(String args[]){
       searchll ll=new searchll();    
        ll.addFirst(4); 
       ll.addFirst(3);
         ll.addFirst(2);
         ll.addFirst(1);
         ll.printn();
       // System.out.println(ll.searchiter(3)); 
        System.out.println(ll.searchrecc(4));

     }
    
}
