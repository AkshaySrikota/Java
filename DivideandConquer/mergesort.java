class mergesort{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void mersort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //intilaze mid
        int mid=si+((ei-si)/2);
        //do left side work
        mersort(arr,si,mid);
        mersort(arr,mid+1,ei);
        //merge left and right with external function
        merge(arr,si,mid,ei);

    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;;//iterator for left part 
        int j=mid+1;//iterator for right part 
        int k=0;//iterator for temo arr

        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        } 
        //for leftover elements of 1st sorted parteft part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for leftover elements of 2nd sorted part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy temp to original arr
        for(k=0,i=si;k<arr.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int  arr[]={6,3,9,5,2,8};
        mersort(arr,0,arr.length-1);
        printArr(arr);


    }

}