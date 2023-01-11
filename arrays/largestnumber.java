import java.util.*;
public class largestnumber {
    public static int lar (int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
if(arr[i]>largest){
    largest=arr[i];
}

        }
        return largest;

    }

    public static void main(String args[]){
        int arr[]={11,223,34,55,45,776,555,77,55,66,33,66,99};
        System.out.println(lar(arr));

    }
    
}
