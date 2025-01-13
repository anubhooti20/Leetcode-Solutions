class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res=0;
        int prevSum=0;
        Map<Integer, Integer> map= new HashMap();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prevSum+=nums[i];
            res+= map.getOrDefault(prevSum- goal,0);
            map.put(prevSum, map.getOrDefault(prevSum,0)+1);
        }
        return res;
    }
}