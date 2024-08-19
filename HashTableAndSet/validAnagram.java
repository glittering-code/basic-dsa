// solution to leetcode problem
//https://leetcode.com/problems/valid-anagram/description/
// submissions - https://leetcode.com/problems/valid-anagram/submissions/1360442680/

class Solution {
    // time complexity = n + n = 2n = n
    // space complexity = n + m = O(n)
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character,Integer> m1 = new HashMap<>();
      //  Map<Character,Integer> m= new HashMap<>();
        for(int i = 0 ; i <s.length() ; ++i) {
            char ch = s.charAt(i);
            if(m1.containsKey(ch) == true) {
                int count = m1.get(ch);
                m1.put(ch,count+1);
            } else {
                m1.put(ch,1);
            }
        }
        for(int i = 0 ; i <t.length() ; ++i) {
            char ch = t.charAt(i);
            if(m1.containsKey(ch) == true) {
                int count = m1.get(ch);
                if(count > 1) {
                    m1.put(ch,count-1);
                } else {
                    m1.remove(ch);
                }
            } else {
                return false;
            }         
        }
        if(m1.isEmpty() == true) 
            return true;
        else
            return false; 
        
    }
}
