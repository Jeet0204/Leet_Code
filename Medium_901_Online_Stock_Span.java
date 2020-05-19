class StockSpanner {
    List<Integer> list = new ArrayList<>();
    public StockSpanner() {
    }
    
    public int next(int price) {
        list.add(price);
        int count=0;
        for(int i=list.size()-1;i>=0;i--)
        {
            if(list.get(i)>price)
                break;
            else
                count++;
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
 