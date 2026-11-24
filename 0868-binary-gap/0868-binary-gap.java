class Solution {
    public int binaryGap(int n) {
        int max = 0;
        int previous = -1;
        int position = 0;
        while(n!= 0){
            if((n&1)==1){
                if(previous != -1) {
                    max = Math.max(max, position - previous);
                 } 
                previous = position;
            }
             n = n>>1;
             position++;
        }
        return max;
    }
}