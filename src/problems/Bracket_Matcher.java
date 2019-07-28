package problems;

import java.util.Stack;

public class Bracket_Matcher {
	
	public static String isBalanced(String s) {
        
		if(s.isEmpty()) {	return "NO";	}
        Stack<Character> stack = new Stack<Character>();
        stack.push('@');
        String result = "NO";
        
        for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
        	if (c == 41) {
				if (stack.peek() != 40) {	return result;	}
				stack.pop();
			} else if (c == 93) {
				if (stack.peek() != 91) {	return result;	}
				stack.pop();
			} else if (c == 125) {
				if (stack.peek() != 123) {	return result;	}
				stack.pop();
			} else {
				stack.push(c);
			}
		}
         
        if(stack.peek()=='@')
            return "YES";
        else
            return "NO";
    }
}
