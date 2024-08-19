// leetcode link
//https://leetcode.com/problems/contains-duplicate/description/
// 0 1 2 3 4 5 6 7
// 1 2 3 4 8 0 9 8
// 
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // O(n)
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length ; ++i) {
            if(s.contains(nums[i]) == true) {
                return true;
            }
            s.add(nums[i]);
        }
        return false;
    }
}
