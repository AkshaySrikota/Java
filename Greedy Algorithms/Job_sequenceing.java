import java.util.*;
public class Job_sequenceing {
    static class Job{
        int deadline;
        int id;//0(A),1(B),2(C)...
        int profit;
        Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String asrgs[]){
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
       ArrayList<Job>jobs=new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
                jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
            }
            
           // Collections.sort(jobs,(a,b)->a.profit-b.profit);//assecending order
            Collections.sort(jobs,(a,b)->b.profit-a.profit);//decending order
            int time=0;
            ArrayList<Integer>seq=new ArrayList<>();
            for(int i=0;i<jobs.size();i++){
                Job curr=jobs.get(i);
                if(curr.deadline>time){
                    seq.add(curr.id);
                    time++;
                }
            }
            //print seq
            System.out.println("max jobs= "+seq.size());
            for(int i=0;i<seq.size();i++){
                System.out.print(seq.get(i)+" ");
            }

        }
    }

