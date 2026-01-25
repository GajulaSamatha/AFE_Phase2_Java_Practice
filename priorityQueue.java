import java.util.PriorityQueue;
public class priorityQueue {
    class CustomPriorityQueue implements Comparable<CustomPriorityQueue>{
        String taskName;
        int priorityLevel;
        CustomPriorityQueue(String s,int l){
            this.taskName=s;
            this.priorityLevel=l;
        }
        @Override
        public int compareTo(CustomPriorityQueue other){
            return this.priorityLevel - other.priorityLevel;
        }

    }
    public static int[] findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int ans[]=new int[k];
        for(int i=0;i<nums.length;i++){
            if(pq.size()<k){
                pq.add(nums[i]);
                continue;
            }
            if(pq.peek()<nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }

    public static int[] findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int ans[] = new int[k];
        for(int i=0;i<nums.length;i++){
            if(pq.size()<k){
                pq.add(nums[i]);
                continue;
            }
            if(pq.peek()>nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }

    //more simplest way
    public static int[] findKLargestEl(int[] nums,int k){
        PriorityQueue<Integer> mpq = new PriorityQueue<>();
        int[] ans= new int[k];
        for(int num:nums){
            mpq.add(num);
            if(mpq.size() > k){
                mpq.poll();
            }
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=mpq.poll();
        }
        return ans;
    }
    
    public static void main(String[] args) {

        int[] KthLargestArray = findKthLargest(new int[]{3,2,1,5,6,4},2); 
        int[] KthSmallestArray = findKthSmallest(new int[]{3,2,1,5,6,4},2);
        int[] KLargestArray = findKthSmallest(new int[]{3,2,1,5,6,4},2);

        System.out.println("K Largest elements: ");
        for(int i=0;i<KthLargestArray.length;i++){
            System.out.println(KthLargestArray[i]);
        }

        System.out.println("K Smallest elements: ");
        for(int i=0;i<KthSmallestArray.length;i++){
            System.out.println(KthSmallestArray[i]);
        }

        System.out.println("K Smallest elements: ");
        for(int i=0;i<KLargestArray.length;i++){
            System.out.println(KLargestArray[i]);
        }

        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(15);

        //printing in aceding order
        System.out.println("Priority Queue after removing 5:");
        for (Integer num : pq) {
            System.out.println(num);    
        }
        
        PriorityQueue<CustomPriorityQueue> cpq= new PriorityQueue<>();
        
        cpq.add(new priorityQueue(). new CustomPriorityQueue("t2",5));
        cpq.add(new priorityQueue(). new CustomPriorityQueue("t4",3));
        cpq.add(new priorityQueue(). new CustomPriorityQueue("t1",1));
        System.out.println("Custom Priority Queue: ");
        for (CustomPriorityQueue num : cpq) {
            System.out.println(num.taskName +" "+ num.priorityLevel);    
        }
        
        
        // System.out.println(pq.poll()); // Should print 5, the smallest element
        // System.out.println("Priority Queue after removing 5:");
        // for (Integer num : pq) {
        //     System.out.println(num);    
        // }

        // pq.remove(5);

        // System.out.println("Priority Queue after removing 5:");
        // System.out.println(pq.poll());
        // for (Integer num : pq) {
        //     System.out.println(num);    
        // }

        // //printing priority queue(Max heap) elements in descending order
        // System.out.println("Priority Queue elements in descending order:");
        // while (!pq.isEmpty()) {
        //     System.out.println(pq.poll());
        // }
    }           
}