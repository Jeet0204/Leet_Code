class Solution {
        public List<List<String>> suggestedProducts(String[] products, String searchWord) {
            List<List<String>> list = new ArrayList<>();
            List<String> string_list;
            PriorityQueue<String> pq = new PriorityQueue<>((a,b)-> b.compareTo(a));
            
            for(int i=0;i<searchWord.length();i++)
            {
                String s = searchWord.substring(0,i+1);
                for(String p:products)
                {
                    if(p.startsWith(s))
                        pq.offer(p);
                    if(pq.size()>3)
                        pq.poll();
                }
            
            string_list = new ArrayList<>();
            while(!pq.isEmpty())
            {
                string_list.add(pq.poll());
            }
            Collections.reverse(string_list);
            list.add(string_list);
        }
    return list;
        
    }
}