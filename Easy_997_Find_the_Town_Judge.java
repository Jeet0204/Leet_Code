class Solution {
    public int findJudge(int N, int[][] trust) {
        if(trust.length==0)
            return 1;
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        int count=0;
        for(int i=0;i<trust.length;i++)
        {
            set.add(trust[i][0]);
            if(!set.contains(trust[i][1]))
                set1.add(trust[i][1]);
            if(set1.contains(trust[i][0]))
                set1.remove(trust[i][0]);
        }
        
        for(int i=0;i<trust.length;i++)
            if(!set1.isEmpty())
                if(set1.iterator().next()==trust[i][1])
                    count++;
        return (count!=N-1)?-1:set1.iterator().next();
    }
}