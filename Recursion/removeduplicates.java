public class removeduplicates {
    public static void remdup(String str,StringBuilder newstr,int idx,Boolean map[]){
        //base
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        //work anf inner function
        if(map[str.charAt(idx)-'a']==true){
            remdup(str,newstr,idx+1,map);
        }
        else{
            map[str.charAt(idx)-'a']=true;
            remdup(str,newstr.append(str.charAt(idx)),idx+1,map);
        }
    }

    public static void main(String args[]){
        String str="apnnacollege";
        remdup(str,new StringBuilder(""),0,new Boolean[26] );
    }
    
}
