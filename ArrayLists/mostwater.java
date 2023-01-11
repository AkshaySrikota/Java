import java.util.ArrayList;
public class mostwater {
    public static int maxwat(ArrayList<Integer>height){//O(n^2)
        int max=0;
        for(int i=0;i<height.size();i++){
            
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int wid=j-1;
                int wat=ht*wid;
                if(max<wat){
                    max=wat;
                }
            
            }
        }
        return max;
    }
    public static int twopoin(ArrayList<Integer>height){//O(n)
        int max=0;
        int lp=0;
        int rp=height.size()-1;
        //cal waterlevel
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int wid=rp-lp;
            int wat=ht*wid;
            if(max<wat){
                max=wat;
            }
            //update pointer
            if(height.get(lp)>height.get(rp)){
                rp--;
            }
            else{
                lp++;
            }
        } 
        return   max;
    }

    public static void main(String args[]){
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxwat(height));
        System.out.println(twopoin(height));

    }
}
