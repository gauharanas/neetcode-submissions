class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();
    
        while (i < j) { // i < j is sufficient
            char f = s.charAt(i);
            char l = s.charAt(j);
            
            // 1. If 'f' is not alphanumeric, skip it
            if (!((f >= 'a' && f <= 'z') || (f >= '0' && f <= '9'))) {
                i++;
            }
            // 2. Else if 'l' is not alphanumeric, skip it
            else if (!((l >= 'a' && l <= 'z') || (l >= '0' && l <= '9'))) {
                j--;
            }
            // 3. Both are alphanumeric, so compare them
            else {
                if (f != l) {
                    return false;
                }
                // Don't forget to move BOTH pointers after a successful match!
                i++;
                j--;
            }
        }
        return true;
    }
}