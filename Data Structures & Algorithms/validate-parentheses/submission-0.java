class Solution {
    public boolean isValid(String s) {
        Stack<Character> box = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(box.empty()) box.push(s.charAt(i));
            else if((box.peek() == '[' && s.charAt(i) == ']') || (box.peek() == '{' && s.charAt(i) == '}') || box.peek() == '(' && s.charAt(i) == ')'){
                box.pop();
            }else
                box.push(s.charAt(i));
        }
        return box.empty();
    }
}
