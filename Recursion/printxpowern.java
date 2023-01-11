public class printxpowern {
    public static int xpown(int x,int n,int i,int ans){//time=O(n)

        if(i==n){
            return ans;
        }
        ans=x*x;
        return xpown(x,n,i+1,ans);
    }
    public static int x_n(int x,int n){//time=O(n)
        if(n==0){
            return 1;
        }
        return x*x_n(x,n-1);
    }

    public static int power (int x,int n){//time=O(n)
        if(n==0){
            return 1;
        }
        if(n%2==0){
           return optpower(x,n/2)*optpower(x,n/2);
        }
        else{
            return x*optpower(x,n/2)*optpower(x,n/2);
        }
    }
    

    public static int optpower (int x,int n){//time=o(logn)
        if(n==0){
            return 1;
        }
        int pow=optpower(x, n/2);
        if(n%2==0){
           return pow*pow;
        }
        else{
            return x*pow*pow;
        }
    }
    public static void main(String args[]){
System.out.println(xpown(5,2,1,1));
System.out.println(x_n(5,2));
System.out.println(power(5,2));
System.out.println(optpower(5,2));
    }
    
}
