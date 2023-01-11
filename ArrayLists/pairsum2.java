import java.util.ArrayList;
public class pairsum2 {

    public static Boolean sum2point(ArrayList<Integer>num,int target){
        int bp=-1;
        for(int i=0;i<num.size();i++){
            if(num.get(i)>num.get(i+1)){
                bp=i;
                break;
            }
        }
        
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(num.get(lp)+num.get(rp)==target){
                return true;
            }
            if(num.get(lp)+num.get(rp)>target){

                rp=(num.size()+rp-1)%num.size();
            }
        
        else{
            lp=(num.size()-1)%num.size();
        }
    }
        return false;
    }



    public static void main(String args[]){//rotaed and sorted
        ArrayList<Integer>num=new ArrayList<>();
        num.add(11);
        num.add(15);
        num.add(6);
        num.add(8);
        num.add(9);
        num.add(10);
        System.out.println(num);
        System.out.println(sum2point(num,16));
    }
    
}
