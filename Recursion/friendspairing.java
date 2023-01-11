public class friendspairing {
    public static int fripair(int n){

        if(n==1||n==2){
            return n;
        }
        return fripair(n-1)+((n-1)*fripair(n-2));
    }    

    public static void main(String args[]){
        System.out.println(fripair(3));
    }
}
