class Solution {
    public int pivotIndex(int[] nums) {
        //calculate the sum of array
        int rightSum=0;
        for(int num:nums){
            rightSum+= num;
        }
        int leftSum=0;

        //Iterate through the array
        for(int i=0;i<nums.length;i++){
            //update the right sum
            rightSum-=nums[i];

            //check if the left sum is equal to right sum
            if(leftSum==rightSum){
                return i;
            }
            //update the left sum
            leftSum +=nums[i];
        }
        return -1;
    }
}