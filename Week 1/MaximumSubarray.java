class Solution {
    public static void main(String[] args){
      int[] nums = {5,4,-1,7,8};
      System.out.println(maxSubArray(nums));
    }
    
    public int maxSubArray(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            max = Math.max(max,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
