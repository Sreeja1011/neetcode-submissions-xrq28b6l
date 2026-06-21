class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int pair[][]=new int [n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }
        int fleet=1;
        Arrays.sort(pair,(a,b)->Integer.compare(b[0],a[0]));
        double prevtime=(target-pair[0][0])/pair[0][1];
        for (int i=1;i<n;i++){
            double dis=target-pair[i][0];
            double currtime=dis/pair[i][1];
            if(currtime>prevtime){
                fleet++;
                prevtime=currtime;
            }
        }
        return fleet;
    }
}
