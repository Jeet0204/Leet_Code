class Solution {
    public int[][] kClosest(int[][] points, int K) {
       int[][] result = new int[K][2];
       Queue<int[]> pq = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        for (int[] curr : points) {
            pq.offer(curr);
            if (pq.size() > K)
                pq.poll();
        }
        System.out.println(pq);
        int i = 0;
        while (!pq.isEmpty()) {
            result[i] = pq.poll();
            i++;
        }
        return result;
    }
}