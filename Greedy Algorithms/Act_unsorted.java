import java.util.*;
 class Act_unsorted {//Tc=O(nlog(n))

    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        
        //forming 2d array
        int act[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            act[i][0]=i;
            act[i][1]=start[i];
            act[i][2]=end[i];
        }
        //sorting
        //lambda function ->shortform
        Arrays.sort(act,Comparator.comparingDouble(o->o[2]));

        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();
        
        //add !st activity/select it
        
        maxAct=1;
        ans.add(act[0][0]);
        int lastEnd=act[0][2];
        
        for(int i=0;i<start.length;i++){//O(n)
            if(act[i][1]>=lastEnd){
                maxAct++;
                ans.add(act[i][0]);
                lastEnd=act[i][2];
            }
        }
        System.out.println("max No.of activities ="+maxAct);
        System.out.println("Activites can be done are with idx ="+ans);
        }
    
}
