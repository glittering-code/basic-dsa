// solution to leetcode question 
// https://leetcode.com/problems/binary-search/
class Solution {
    // O(n)
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1; // r = 0
        while(l <= r) {
            int mid = (l+r)/2;
            //System.out.println(l + "\t" + r + "\t" + mid);
            if(nums[mid] == target)
                return mid;
            if(nums[mid] > target) {
                r = mid-1;
            } else {
                l = mid+1;
            }

        }
        return -1;
               
    }
}
