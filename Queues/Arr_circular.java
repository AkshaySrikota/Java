public class Arr_circular {
    

        static class Queue{
            static int arr[];
            static int size;
            static int rear;
            static int front;
        
            Queue(int n){
                arr=new int[n];
                size =n;
                rear=-1;
                front =-1;
            }
        //isEmpty()
            public static boolean isEmpty(){
                return rear==-1&&front==-1;
            }
        //isFull()
            public static Boolean isFull(){
                return (rear+1)%size==front;
            }
        //add()
            public static void add(int data){//O(1)
                if(isFull()){
                    System.out.println("Can't add arr is full");
                    return;
                }
                if(front==-1){
                    front=0;
                }
                rear=(rear+1)%size;
                arr[rear]=data;
            }   
        //remove()
            public static int remove(){//O(n)=tc
                if(isEmpty()){
                    return -1;
                }
                
                if(rear==front){//last element remove
                    front=rear=-1;
                }else{
                    front=(front+1)%size;
                }
                return arr[front];
            }
        //peek()
            public static int peek(){
                if(isEmpty()){
                    System.out.println("empty");
                    return -1;
                }
                return arr[front];
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

