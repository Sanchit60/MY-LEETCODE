class Solution {
    public int reverse(int x) {
        Stack<Integer> st = new Stack<>();
        long reversed = 0;
        while(x != 0){
            int digit = x % 10;
            st.push(digit);
            x /= 10;
        }
        long placeValue = 1;
        while(st.size() != 0){
            reversed += st.pop() * placeValue;
            placeValue *= 10;
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int) reversed;
        
    }
}
