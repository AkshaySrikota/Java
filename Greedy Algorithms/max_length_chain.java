import java.util.*;
public class max_length_chain {
    public static void main(String args[]){//O(nlogn)
        int arr[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
        
        int chainEnd=arr[0][1];
        int chainLen=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>chainEnd){
                chainLen++;
                chainEnd=arr[i][1];
                
            }
            
        }
        System.out.println(chainLen);
    }
}
