class Solution {
    public boolean isValid(String s) {
        //if the len is odd -> out
        if (s.length() % 2 != 0)
        {
        return false;
        } 
        //new stack to push chars onto
        Stack<Character> stack = new Stack<>();
        //if even then put in the loop and check if they match.
        for (char c : s.toCharArray()) {
         
        if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
        }
            // if closing bracket
            else {
                if (stack.isEmpty())
                {
                    return false;
                }
                char open = stack.pop();

                if (validOnes(open) != c) {
                    return false;
                }
            }
    }
    return stack.isEmpty();
    }

    public char validOnes(char parentheses){
        switch (parentheses) {
            case '{':
                return '}';
            case '(':
                return ')';
            case '[':
                return ']';
            default:
                return ' ';
        }
    
    }
}
