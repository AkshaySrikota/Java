import java.util.*;
public class Indiancoins {
    public static void main(String args[]){
        int coin[]={1,2,5,10,20,50,100,500,1000,2000};
            int amount=590;
            int count=0;
            ArrayList<Integer>ans=new ArrayList<>();
            Arrays.sort(coin);
            for(int i=coin.length-1;i>=0;i--){
                if(coin[i]<=amount){
                    while(coin[i]<=amount){
                    count++;
                    amount=amount-coin[i];
                ans.add(coin[i]); }
                }
            }
            
        System.out.println(count);
        System.out.println(ans);
    }
}
