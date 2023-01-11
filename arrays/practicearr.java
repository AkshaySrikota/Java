public class practicearr {
public static void Binser(int arr[],int key){
    int si=0;
        int ei=arr.length-1;
while(si==ei||si<ei){
    int mid=(si+ei)/2;
    if(arr[mid]==key){
        System.out.println(mid);
        return;
    }
    if(arr[mid]>key){
        si=mid;
    }
    if(arr[mid]<key){
ei=mid;
    }
}
    System.out.println("not found");
    return;
}
public static void revarr(int arr[]){
  int si=0;
  int ei=arr.length-1;
    while(si<ei){
        int temp=arr[si];
        arr[si]=arr[ei];
        arr[ei]=temp;
        si++;
        ei--;
    }
    for(int i=0;i<arr.length;i++){ 
System.out.print(arr[i]);
}}
public static void pair(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            System.out.print("("+i+","+j+")");
        }
        System.out.println();
    }
}
public static void subarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+",");
            }
            System.out.print(" ");
        }System.out.println();
    }
}
public static void maxsubarr1(int arr[]){//O(n^3)
    int max= Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
                sum+=arr[k];
            }
            if(max<sum){
                max=sum;
            }
            
        }
    }System.out.println(max);
}
public static void prefixmaxsubarr(int arr[]){//O(n^2)
    int maxsum=Integer.MIN_VALUE;
int prefixarr[]=new int[arr.length];
prefixarr[0]=arr[0];
//making prefix arr
for(int i=1;i<arr.length;i++){
    prefixarr[i]=prefixarr[i-1]+arr[i];
}
//finding maxsubarrsum
for(int i=0;i<arr.length;i++){
    int si=i;
    for(int j=0;j<arr.length;j++){
        int ei=j;
        int currsum=(si==0?prefixarr[ei]:prefixarr[ei]-prefixarr[i-1]);
        if(maxsum<currsum){
            maxsum=currsum;
        }
    }
  
}
System.out.println(maxsum);
}
public static void kadanes_maxsubarr(int arr[]){//O(n)
int max=Integer.MIN_VALUE;
int currsum=0;
for(int i=0;i<arr.length;i++){
    currsum+=arr[i];
    if(currsum<0){
        currsum=0;
    }
if(max<currsum){
    max=currsum;
}
}
System.out.println(max);
}
    public static void main(String args[]){
 int arr[]={1,2,3,4,5,6,7,8,9,10};
 System.out.println(arr.length);
Binser(arr,5);
revarr(arr);
pair(arr);
 int tarr[]={1,2,3,4,5,6,7,8,9,10};
subarr(tarr);
maxsubarr1(tarr);
prefixmaxsubarr(tarr);
kadanes_maxsubarr(arr);

    }
    
}
