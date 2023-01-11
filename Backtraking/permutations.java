public class permutations {
    public static void permu(String str,String ans){//time=O(n*n!);space=O(n)
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
           String  Newstr=str.substring(0,i)+str.substring(i+1);
           permu(Newstr,ans+curr);

        }
    }
    public static void main(String args[]){
        String str="abc";
        permu(str,"");

    }
}
