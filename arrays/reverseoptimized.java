public class reverseoptimized {
    public static void reverse(int arr[]){
    int first=0,last=arr.length-1;
while(first<last){
    int un=0;
    un=arr[first];
    arr[first]=arr[last];
    arr[last]=un;
    first++;
    last--;

}
    }
    public static void main(String args[]){
        int arr[]={1,2,33,44,556,34};
        reverse(arr);
        for(int i=0;i<arr.length;i++){ 
        System.out.println(arr[i]);
    }}
    
}
