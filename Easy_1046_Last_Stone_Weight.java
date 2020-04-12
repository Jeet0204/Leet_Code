class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = Arrays.stream(stones).boxed().collect(Collectors.toList());
        Collections.sort(list);
        System.out.println(list);
        for(int i=list.size()-1;i>0;)
        {
            if(list.get(i)==list.get(i-1))
            {
                list.remove(i);
                list.remove(i-1);
                i=i-2;
            }
            else
            {
                list.set(i-1,list.get(i)-list.get(i-1));
                list.remove(i);
                i--;
            }
            Collections.sort(list);
        }
        return list.isEmpty() ? 0:list.get(0);
    }
}