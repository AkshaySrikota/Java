public class updatearr {
    public static void update(int arr[]){
for(int i=0;i<arr.length;i++){
    arr[i]=arr[i]+2;
}
    }
    public static void main(String args[]){
int arr[]=new int[50];
arr[0]=0;
arr[1]=1;
arr[2]=2;
update(arr);
System.out.println(arr[0]);
System.out.println(arr[1]);
    }
    
}
