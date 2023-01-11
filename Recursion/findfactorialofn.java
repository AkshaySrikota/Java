public class findfactorialofn {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
       int fm1=fact(n-1);
       int fn=n*fact(n-1);
       return fn;
    }
    public static int simplefact(int n){
        if(n==0){
            return 1;
        }
       return n*fact(n-1);
    }
    public static void main(String args[]){
       int ans= simplefact(5);
       System.out.println(ans);
    }
    
}
