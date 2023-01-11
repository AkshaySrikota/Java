import java.util.*;
public class passingofarray{
    public static void pass(int arr[]){
        arr[0]=arr[0]+100;
        
    }
public static void main(String args[]){
    int arr[]=new int[10];
    arr[0]=11;
    arr[1]=0;
    System.out.println(arr[0]);
pass(arr);
System.out.print(arr[0]);
}
}