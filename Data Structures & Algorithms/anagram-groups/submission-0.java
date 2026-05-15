class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String n : strs) {
            int[] key = new int[26];
            for (char i : n.toCharArray()) {
                key[i - 'a']++;
            }
            String newKey = Arrays.toString(key);
            map.computeIfAbsent(newKey, Key -> new ArrayList<>()).add(n);

        }
        return new ArrayList<>(map.values());
    }
}
