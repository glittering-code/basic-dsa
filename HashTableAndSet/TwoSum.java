// solution to leetcode problem
//https://leetcode.com/problems/two-sum/
//submission link : https://leetcode.com/problems/two-sum/submissions/1359217426/
class Solution {
    // <key,value>
    // time complexity  O(n)
    // space complexity = 
    public int[] twoSum(int[] nums, int target) {
        int [] ret = new int[2]; // 2 units 
        Map<Integer,Integer> s = new HashMap<Integer,Integer> ();  // 2n
        for(int i = 0 ; i < nums.length ; ++i) { //1
            int diff = target-nums[i]; //1 
            if(s.containsKey(diff) == true) {
                int idx = s.get(diff); // 1st index // 1
                ret[0] = idx;
                ret[1] = i;
                return ret;
            }
            s.put(nums[i],i); 
        }
        ret[0] = -1;
        ret[1] = -1;
        return ret;
        //return false;    
    }
}
// space = 2n+4 = O(n)
