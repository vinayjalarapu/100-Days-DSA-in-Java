class Solution {
    public int reversePairs(int[] nums) {
       return mergesort(nums,0,nums.length-1);
        
    }
    private static void merge(int[] nums,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left++]);
            }else{
                temp.add(nums[right++]);
            }
        }
        while(left<=mid)
        temp.add(nums[left++]);
        while(right<=high)
        temp.add(nums[right++]);
        for(int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }
    }
    private  static int countpairs(int[] nums,int low,int mid,int high){
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high &&(long)nums[i]>2L*nums[right]){
                right++;
            }
            count+=(right-(mid+1));
        }
        return count;
    }
    private static int mergesort(int[]nums,int low,int high){
        if(low>=high){
            return 0;
        }
        int mid=(low+high)/2;
        int count=mergesort(nums,low,mid);
        count+=mergesort(nums,mid+1,high);
        count+=countpairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;
    }
}
