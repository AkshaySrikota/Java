import java.util.*;
public class nextGreater {
    public static void nextGreat(int arr[],int nextG[]){//O(n)
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            //while loop
            while(!s.isEmpty()&&s.peek()<=arr[i]){
                s.pop();
            }
            //if-else
            if(s.isEmpty()){
                nextG[i]=-1;
            }
            else{
                nextG[i]=s.peek();
            }
            s.push(arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int nextG[]=new int[arr.length];
        nextGreat(arr,nextG);
        for(int i=0;i<nextG.length;i++){
            System.out.print(nextG[i]+" ");
        }
        //nextGreater right--above fun
        //nextGreater left
        //nextSmaller right
        //nextSmaller left
    }
    
}
