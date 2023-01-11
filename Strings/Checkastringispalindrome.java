public class Checkastringispalindrome {
    public static boolean ispal(String str){
      int n= str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;

            }
        }
        return true;
    }
    public static void main(String args[]){
String pal="racecar";
System.out.print(ispal(pal));



    }
    
}
