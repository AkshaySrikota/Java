import java.util.ArrayList;
import java.util.Collections;
public class sortinAL {
  public static void main(String args[]){
    ArrayList<Integer>num=new ArrayList<>();
    num.add(3);
    num.add(6);
    num.add(2);
    num.add(1);
    num.add(4);
    System.out.println(num);
    //asecending
    Collections.sort(num);
    System.out.println(num);
    //decending
    Collections.sort(num,Collections.reverseOrder());//comparator-fxn logic
    System.out.println(num);

  }
}
