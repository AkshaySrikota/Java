public class AddMiddle{

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



public void add(int idx,int data){
    if(idx==0){
        addFirst(data);
    }
    Node newNode=new Node(data);
Node temp=head;
int i=0;
while(i<idx-1){
    temp=temp.next;
    i++;
}
 newNode.next=temp.next;
 temp.next=newNode;

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
public static void main(String args[]){
    AddMiddle ll=new AddMiddle();    
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.add(1,77);
    ll.printn();
}

    
}
