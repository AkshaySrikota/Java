import java.util.ArrayList;
public class pairsum1 {

    public static Boolean pairsum1(ArrayList<Integer>num,int target ){

        for(int i=0;i<num.size();i++){

            for(int j=i+1;j<num.size();j++){
            if((num.get(i)+num.get(j))==target){
                return true;
            }
        }
        }
        return false;
    }
    public static Boolean pairsum1_2pointer(ArrayList<Integer>num,int target){
       int lp=0;
       int rp=num.size()-1;
       while(lp<rp){
        if(num.get(lp)+num.get(rp)==target){
            return true;
        }
        else if(num.get(lp)+num.get(rp)>target){
            rp--;
        }
        else {
            lp++;
        }   
       }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer>num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println(num);
        System.out.println(pairsum1(num,5));
        System.out.println(pairsum1_2pointer(num,5));

    }
    
    
    
}
