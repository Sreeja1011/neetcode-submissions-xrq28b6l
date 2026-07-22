class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:stones){
            pq.add(x);
        }
        while(pq.size()>1){
            int max=pq.poll();
            int smax=pq.poll();
            if(max-smax>0){
                pq.add(max-smax);
            }
        }
        if(pq.size()==1){
            return pq.poll();
        }
        return 0;
    }
}
