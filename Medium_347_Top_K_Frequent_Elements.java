class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int [] result = new int[k];
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> val:map.entrySet())
        {
            pq.offer(val);
            if(pq.size()>k)
                pq.poll();
        }
        int i=0;
        while(pq.size()!=0){
            result[i] = pq.poll().getKey();
            i++;
        }
        System.out.println(map+"........."+pq);

        return result;
    }
}