public class DynamicProgrammin{
    /*
     * You are climbing a staircase. It takes n steps to reach the top.
        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     */
    public static int climbStairs(int n) {
        int[] mem= new int[n+1]; // so when we are at 0th step we need to return 0 and for 1 we have to return 1, so we should not suposed to calculate the no. of ways to reach 0th step.. so we store for that too in our memorization... thus the size is n+1
        for(int i=0;i<n+1;i++){
            mem[i]=-1;
        }
        return recur(mem,n);
        /*
            so 0th index represents the no. of ways t reach 0th step
            1st index - 1st step
            2nd index - 2nd step
            .
            .
            .
            nth index - nth step  

            thus we passed 'n' to the recur function     
         */
    }
    public static int recur(int[] mem, int i){
        if(i<=1){
            return 1; //base cases
        }
        if(mem[i]!=-1){//represents we calculated it, so fetch from memory
            return mem[i];
        }
        int c= recur(mem,i-1)+recur(mem,i-2); // represents not calculated yet.. so calculating..
        mem[i]=c;
        return mem[i];
    }

    /*
     * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
    Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
     */
    public static int rob(int[] nums) {
        int[] memo=new int[nums.length+1];
        for(int i=0;i<memo.length;i++){
            memo[i]=-1;
        }
        return houserobber(nums,nums.length-1,memo);
    }
    public static int houserobber(int[] nums,int n,int[] memo){
        if(n<0){
            return 0;
        }
        if(memo[n]==-1){
            int rob= nums[n]+houserobber(nums,n-2,memo);
            int skip= houserobber(nums,n-1,memo);
            memo[n]= Math.max(rob,skip);
        }
        return memo[n];
    }
    /*
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

    F(0) = 0, F(1) = 1
    F(n) = F(n - 1) + F(n - 2), for n > 1.
    Given n, calculate F(n).
     */
    public static int fib(int n) {
        int n1=0,n2=1,fibb=0;
        for(int i=0;i<n;i++){
            fibb=n1+n2;
            n1=n2;
            n2=fibb;
            System.out.println(fibb);
        }
        return n1;
    }
    public static void main(String args[]){
        System.out.print(fib(4));
        System.out.println(climbStairs(20));
        int[] arr={2,4,3,5,6};
        System.out.println(rob(arr));
    }
}