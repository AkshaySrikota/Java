import java.util.*;
public class min_absolutediff {//Tc=O(nlogn)
    public static void main(String args[]){
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};

        //sorting
        Arrays.sort(A);
        Arrays.sort(B);
        int min=0;
        for(int i=0;i<A.length;i++){
            min+=Math.abs(A[i]-B[i]);
        }
        System.out.println(min);
    }
}
