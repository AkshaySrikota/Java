import java.util.*;
public class trappingrainwater {
public static void trapwat(int arr[]){
    //intilizing leftmax,rightmaxrr
    int leftMax[]=new int[arr.length];
    int rightMax[]=new int[arr.length];
    //calculating leftmax of each element
    leftMax[0]=arr[0];
    for(int i=1;i<arr.length;i++){
        leftMax[i]=Math.max(leftMax[i-1],arr[i]);
    }
   
    //calculating leftmax of each element
       rightMax[arr.length-1]=arr[arr.length-1];
       for(int i=arr.length-2;i<0;i--){
           leftMax[i]=Math.max(rightMax[i-1],arr[i]);
       }
    //calculating tapped water
    int trapedwater=0;
     for(int i=0;i<arr.length;i++){
        int waterlevel=Math.min(leftMax[i],rightMax[i]);
        if(waterlevel-arr[i]<0){
            System.err.println("no water");
        }
        else{ 
        trapedwater+=waterlevel-arr[i];
        }
       
     }
System.err.println(trapedwater);
}
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        trapwat(arr);
    }
    
}
