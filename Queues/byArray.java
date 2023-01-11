class byArray{

static class Queue{
    static int arr[];
    static int size;
    static int rear;

    Queue(int n){
        arr=new int[n];
        size =n;
        rear=-1;
    }
//isEmpty()
    public static boolean isEmpty(){
        return rear==-1;
    }
//isFull
    public static Boolean isFull(){
        return rear==size-1;
    }
        //add()
    public static void add(int data){//O(1)
        if(rear==size-1){
            System.out.println("Can't add arr is full");
            return;
        }
        rear=rear+1;
        arr[rear]=data;
    }   
//remove()
    public static int remove(){//O(n)=tc
        if(rear==-1){
            return -1;
        }
        int front =arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return front;
    }
//peek()
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return arr[0];
    }
}
public static void main(String args[]){

    Queue q=new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    //1-2-3>>fifo
    System.out.println(q.peek());
    q.remove();
    System.out.println(q.peek());
    q.remove();
    System.out.println(q.peek());

}

}