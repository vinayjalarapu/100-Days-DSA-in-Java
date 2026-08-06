class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int i=0,j=0,k=0;
        int ans[]=new int[m+n];
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i++];
            }
            else{
                ans[k++]=nums2[j++];
            }
        }
        while(i<m){
            ans[k++]=nums1[i++];
        }
        while(j<n){
            ans[k++]=nums2[j++];
        }
        int len=m+n;
        if(len%2==1){
            return ans[len/2];
        }else{
            return (ans[len/2]+ans[len/2-1])/2.0;
        }
        
    }
}
