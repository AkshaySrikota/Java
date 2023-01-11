public class lastoccurance {
    public static int lastocc(int arr[],int i,int key,int ans){
        if(i==arr.length){
                return ans;
        }
        if(arr[i]==key){
            ans=i;
        }
        return lastocc(arr,i+1,key,ans);
    } 
    public static void main(String args[]){
       int arr[]={1,2,3,3,4,4,5,3,56,7,4,3,9};
       System.out.println(lastocc(arr,0,3,-1));
    }
    
}
