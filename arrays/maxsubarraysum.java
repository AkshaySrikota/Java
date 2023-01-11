public class maxsubarraysum {
    public static int maxsum(int arr[]){
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
sum=arr[k]+sum;
                }
                if(sum>ans){
                    ans=sum;
                }
            }
        }
        return ans;
    }
    public static void prefixmaxsubarr(int arr[]){
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
        int arr[]={-1,2,3,4,5,-6,-20};
      System.out.println( maxsum(arr));
      prefixmaxsubarr(arr);
      kadanes_maxsubarr(arr);


    }
    
}
