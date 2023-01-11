public class printsummoffirstnnaturalnumbers {
    public static int Sumof(int n){
        if(n==1){
            return 1;
        }
        int snm1=Sumof(n-1);
        int sn=snm1+n;
        return sn;
    } 
    public static int simpleSumof(int n){
        if(n==1){
            return 1;
        }
        return n+simpleSumof(n-1);
    } 

    public static void main(String args[]){
        System.out.println(simpleSumof(5));
        System.out.println(Sumof(5));
    }
}
