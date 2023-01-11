public class backtrackingarr {
    public static void arrback(int arr[],int i,int val ){
        //base case
        if(i==5){
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        arrback(arr,i+1,val+1);//fun call step
        arr[i]=arr[i]-2;//backtracking step
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        arrback(arr,0,1);
        printArr(arr);
    }
    
    
}
