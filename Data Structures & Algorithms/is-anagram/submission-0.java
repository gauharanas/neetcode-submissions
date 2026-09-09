class Solution {
    public boolean isAnagram(String s, String t) {
        // s = s.toLowerCase;
        // t = t.toLowerCase;
        int alpha[] = new int [26];
        if(s.length()!=t.length()) return false;
        else
        {
            for(int i=0;i<s.length();i++)
            {
                alpha[s.charAt(i)-'a']++;
                alpha[t.charAt(i)-'a']--;
            }
            for(int i=0;i<alpha.length;i++)
            {
                if(alpha[i]!=0) return false;
            }
        }
        return true;
    }
}
