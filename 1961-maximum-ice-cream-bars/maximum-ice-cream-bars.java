class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int bars=0;
        Arrays.sort(costs);
        for(int i:costs){
            if(i <= coins){
                coins-=i;
                bars++;
            }
        }
        return bars;
    }
}