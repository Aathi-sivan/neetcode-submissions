class Solution {
    public boolean canConstruct(String ransom, String magazine) {{

        int[] freq = new int[26];
        if (ransom.length() > magazine.length())
            return false;

        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransom.length(); i++) {

            freq[ransom.charAt(i) - 'a']--;
            if (freq[ransom.charAt(i) - 'a'] < 0)
                return false;
        }

       return true;
    }
        
    }
}