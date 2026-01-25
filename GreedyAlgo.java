import java.util.Arrays;
public class GreedyAlgo {
    public static int maxNonOrLpAct(int[][] tasks){
        int count=0;
        int end=-1;
        Arrays.sort(tasks,(a,b)->a[1]-b[1]);
        //here tasks is int data type 2D array, still sort works because we are providing comparator
        /**
         * sort makes the earlier task to be appear first so that we can maximize the count
         */
        for(int[] task:tasks){
            if(task[0]>=end){
                count++;
                end=task[1];
            }
        }
        return count;
    }
    /**
     * 30 ==> 26,25,5,2,2
     * @param args
     */
    public static int minCoins(Integer[] coins, int amount){
        Arrays.sort(coins,(a,b)->b-a);
        //here it raised error when we used int[] instead of Integer[] because int is primitive data type and cannot be used to call methods
        //but tasks is also int[][] and we were able to call sort method on it
        //because in case of 2D array we provided comparator for comparing 2 arrays but here we are comparing 2 integers
        //even int[] are objects but int is primitive data type
        //as sort method for arrays is overloaded to take comparator for objects only
        //hence we used Integer[] here

        //how is that int[] is an object??
        //because in java everything except primitive data types are objects
        //
        int count=0;
        for(int coin:coins){
            while(amount>=coin){
                amount-=coin;       
                count++;
            }
        }
            return count;
    }
    public static void main(String args[]){
        int[][] tasks={{0,8},{1,3},{3,5},{5,7},{8,9}};
        System.out.println("Maximum count of activities:"+maxNonOrLpAct(tasks));

    }
}

