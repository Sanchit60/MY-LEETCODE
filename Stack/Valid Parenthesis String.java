class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                leftStack.push(i);
            }else if(ch == '*'){
                starStack.push(i);
            } else{
                if(leftStack.size() != 0){
                    leftStack.pop();
                } else if(starStack.size() != 0){
                    starStack.pop();
                } else{
                    return false;
                }
            }
        }
        while(leftStack.size() != 0 && starStack.size() != 0){
            if(leftStack.peek() < starStack.peek()){
                leftStack.pop();
                starStack.pop();
            } else{
                break;
            }
        }
        return leftStack.isEmpty();
    }
}
