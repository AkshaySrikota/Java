public class findsubarr {//time=O(n*2^n);space=O(n)
    public static void subsets(String str,String ans,int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes choice
        subsets(str,ans+str.charAt(i),i+1);
        //no choice
        subsets(str,ans,i+1);
    }
    public static void main (String args[]){
        String str="abc";
        subsets(str,"",0);
    }
    
}
