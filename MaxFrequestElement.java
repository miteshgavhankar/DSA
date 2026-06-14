class Solution {
    public int mostFrequentElement(int[] nums) {
        
        int n = nums.length;
        int maxFreq = 0;
        int maxEle = 0;
        boolean[] visited = new boolean[n];

        for(int i=0;i<n;i++){
            if(visited[i]) continue;

            int freq = 0;

            for(int j=i;j<n;j++){
                if(nums[i]==nums[j]) {
                    freq++;
                    visited[j] = true;
                }
            }

            if(freq > maxFreq) {
                maxFreq = freq;
                maxEle = nums[i];
            } else if ( freq == maxFreq) {
                maxEle = Math.min(maxEle, nums[i]);
            }
        }

        return maxEle;

    }
}


