import java.util.ArrayList;
public class operations {
    public static void main(String args[]){
        ArrayList<Integer>num=new ArrayList<>();
        //Add element-O(1)
        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println(num);
        num.add(1,7);
        System.out.println(num);
        //get element-O(1)
        int eleatidx=num.get(2);
        System.out.println(eleatidx);
        //remove element-O(n)
        num.remove(1);
        System.out.println(num);
        //Set Element at Index -O(n)
        num.set(1,9);
        System.out.println(num);
        //Contains Eleemnt-O(n)
        System.out.println(num.contains(9));




        //size of ArrayList
        System.out.println( num);
        System.out.println( num.size());

        //print numvales
        for(int i=0;i<num.size();i++){
            System.out.print(num.get(i)+" ");
        }


    }
    
}
