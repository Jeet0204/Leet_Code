class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int []arr = new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            if(map.containsKey(numbers[i]))
            {
                arr[0] = map.get(numbers[i])+1;
                arr[1] = i+1;
            }
            map.put(target-numbers[i],i);

        }
        return arr;
    }
}