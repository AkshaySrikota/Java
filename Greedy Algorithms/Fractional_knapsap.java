import java.util.*;
public class Fractional_knapsap {

    public static void main(String args[]){
        int weight[]={10,20,30};
        int val[]={60,100,120};
        int W=50;
        //2d array
        double ratio[][]=new double[val.length][2];
        for(int i=0;i<weight.length;i++){
        ratio[i][0]=i;
        ratio[i][1]=val[i]/(double)weight[i];
        }

        //sorting
        //lambda fun-assending
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity=W;
        int finalVal=0;

        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){//include full item
                finalVal+=val[idx];
                capacity-=weight[idx];
            }else{
                //include fractional item
                finalVal+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("finial value= "+finalVal);
    }

}

