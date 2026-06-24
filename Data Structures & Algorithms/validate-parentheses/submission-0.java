class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                stack.push(ch);
            }else {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if(ch == map.get(top)) {
                    stack.pop();
                } else {
                    return false;
                }

            }

            

        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}

