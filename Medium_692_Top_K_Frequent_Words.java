class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<words.length;i++)
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->map.get(a).equals(map.get(b))? b.compareTo(a):map.get(a)-map.get(b));
        
        for(String freq : map.keySet())
        {
            pq.offer(freq);
            if(pq.size()>k)
                pq.poll();
        }
        
        while(pq.size()!=0)
        {
            list.add(pq.poll());
        }
        Collections.reverse(list);
        return list;
    }
}