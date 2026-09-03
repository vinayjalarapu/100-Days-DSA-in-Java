class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums1.length;i++) {
             int num=nums1[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i=0;i<nums2.length;i++) {
           int num=nums2[i];

            if (map.getOrDefault(num, 0) > 0) {

                ans[k] = num;
                k++;
                map.put(num, map.get(num) - 1);
            }
        }
        return Arrays.copyOf(ans, k);
    }
}
