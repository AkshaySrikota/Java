public class gridways {
    public static int gways(int i,int j,int n,int m){
        //base case
        if(i==n-1&&j==m-1){
            return 1;
        }
        else if(i==n||j==m){
            return 0;
        }

        //recursion
        int w2=gways(i,j+1,n,m);
        int w1=gways(i+1,j,n,m);
        return w1+w2;
    }

    public static void main(String args[]){
       System.out.println(  gways(0,0,5,5));
       
    }
    
}
