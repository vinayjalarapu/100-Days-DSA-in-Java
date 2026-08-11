class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        Set<Integer>set=new HashSet<>(n);
        for(int num:nums){
            set.add(num);
        }
        int presum=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                presum+=1;
            }
            else{
                break;
            }
        }
        sum=((nums[presum-1]+nums[0])*presum)/2;
        while(set.contains(sum)){
            sum+=1;
        }
        return sum;
        
    }
}
