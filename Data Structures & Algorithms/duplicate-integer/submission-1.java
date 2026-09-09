
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> a = new HashSet<Integer>();
        for(int i:nums)
        {
            if(a.contains(i))
            {
               return true;
            }
            a.add(i);

        }
        return false;
    }
}
