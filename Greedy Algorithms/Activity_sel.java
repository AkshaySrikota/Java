import java.util.*;
class Activity_sel{
public static void main(String args[]){
int start[]={1,3,0,5,8,5};
int end[]={2,4,6,7,9,9};

int maxAct=0;
ArrayList<Integer>ans=new ArrayList<>();

//add !st activity/select it

maxAct=1;
ans.add(0);
int lastEnd=end[0];

for(int i=0;i<start.length;i++){//O(n)
    if(start[i]>=lastEnd){
        maxAct++;
        ans.add(i);
        lastEnd=end[i];
    }
}
System.out.println("max No.of activities ="+maxAct);
System.out.println("Activites can be done are with idx ="+ans);
}

}