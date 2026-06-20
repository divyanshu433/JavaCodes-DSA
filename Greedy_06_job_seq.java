import java.util.*;
public class Greedy_06_job_seq {

    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int id, int deadline, int profit){
            this.id = id;
            this.profit = profit;
            this.deadline = deadline;
        }

    }

    public static void main(String[] args) {
        int jobInfo[][] = {{4 ,20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList <Job> jobs = new ArrayList<>();
        for(int i = 0; i < jobInfo.length; i++){
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        // decending order sorting of a object
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);
        int time = 0;
        ArrayList <Integer> seq = new ArrayList<>();
        for(int i = 0; i < jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("MAX job : " + seq.size());
        System.out.println(seq);
    }
}
