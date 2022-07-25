package com.greatlearning.balancedbracket;

import java.util.Stack;

public class BalancedBracketsService {

	public static boolean balancedParenthesis(String str) {
		Stack stack = new Stack();
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = (char) stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;
			case '}':
				check = (char) stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;
			case ']':
				check = (char) stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}

}
