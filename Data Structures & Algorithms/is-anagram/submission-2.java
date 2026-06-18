class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i=0; i<t.length(); i++) {
            if(!map1.containsKey(t.charAt(i))) {
              return false;
            }
            int count = map1.get(t.charAt(i));
            if(count == 0) {
                return false;
            }
            map1.put(t.charAt(i), count-1);
        }
        for(Integer value : map1.values()) {
            if(value != 0) {
                return false;
            }
        }
        return true;
    }
}
