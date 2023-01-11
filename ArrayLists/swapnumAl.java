import java.util.ArrayList;
public class swapnumAl {
    public static void swap(int idx1,int idx2,ArrayList<Integer>num){
        int temp=num.get(idx1);
        num.set(idx1,num.get(idx2));
        num.set(idx2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer>num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println(num);
        swap(1,3,num);
        System.out.println(num);


    }
    
}
