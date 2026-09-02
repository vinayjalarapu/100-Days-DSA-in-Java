class Solution {
    public static void ms(int nums[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        ms(nums,low,mid);
        ms(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public static void merge(int nums[],int low,int mid,int high){
        int p1=low;
        int p2=mid+1;
        int k=0;
        int temp[]=new int[high-low+1];
        while(p1<=mid && p2<=high){
            if(nums[p1]<=nums[p2]){
                temp[k++]=nums[p1++];
            }else{
                temp[k++]=nums[p2++];
            }
        }
        while(p1<=mid){
            temp[k++]=nums[p1++];
        }
         while(p2<=high){
            temp[k++]=nums[p2++];
        }
        for(int i=0;i<temp.length;i++){
            nums[low+i]=temp[i];
        }
    } 
    public int[] sortArray(int[] nums) {
        ms(nums,0,nums.length-1);
     return nums;   
    }
}
