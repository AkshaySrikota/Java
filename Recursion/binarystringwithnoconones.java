public class binarystringwithnoconones {
    public static void Bistr(int n,int lastplace,String str){
        //base
        if(n==0){
            System.out.println(str);
        }
        //work
        Bistr(n-1,0,str+"0");
        if(lastplace==0){
            Bistr(n-1,1,str+"1"); 
        }
    }
    public static void main(String args[]){
        Bistr(3,0,"");
    }
}
