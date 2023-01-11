public class linearesearch {
    public static boolean lin_sear(int arr[],int key){
        boolean ans=true;
        for(int i=0;i<arr.length;i++){
if(arr[i]==key){
    return true;
}
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,1,0,43,44,55,6,7,7,7,88};
        int key=44;
        System.out.println(lin_sear(arr,key));

    }
}
