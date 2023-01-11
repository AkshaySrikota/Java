public class fibonaccinumber {
    public static int Fib(int n){
        if((n)==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return Fib(n-1)+Fib(n-2);
    } 
    public static void main(String args[]){
       System.out.println( Fib(6));
      
    }
}
