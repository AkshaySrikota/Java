import java.util.*;
public class multiDAL {

    public static void main(String args[]){
        ArrayList<ArrayList<Integer>>mulAL=new ArrayList<>();
        ArrayList<Integer>num1=new ArrayList<>();
        num1.add(1);num1.add(2);
        mulAL.add(num1);

        ArrayList<Integer>num2=new ArrayList<>();
        num2.add(33);num2.add(44);
        mulAL.add(num2);
            System.out.println(mulAL);

        //to get every element
        for(int i=0;i<mulAL.size();i++){
            ArrayList<Integer>currlist=mulAL.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }

        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer>t1=new ArrayList<>();
        ArrayList<Integer>t2=new ArrayList<>();
        ArrayList<Integer>t3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            t1.add(i*1);
            t2.add(i*2);
            t3.add(i*3);
        
        }
        mainlist.add(t1);
        mainlist.add(t2);
        mainlist.add(t3);
        System.out.println(mainlist);
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer>curr=mainlist.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }

    }
    
}
