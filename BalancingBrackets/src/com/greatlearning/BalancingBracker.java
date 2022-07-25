package com.greatlearning;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String bracketExpression=sc.next();
		Boolean result;
		result=checkingBrackerBalancing(bracketExpression);
		if(result)
			System.out.println("The entered string has balanced brackets");
		else
			System.out.println("The entered string doesn't contain balanced brackets");
	}
	
		static boolean checkingBrackerBalancing(String bracketExpression) {
			Stack<Character> stack=new Stack<Character>();
			//Traversing the expression
			for (int i = 0; i < bracketExpression.length(); i++) {
				char x=bracketExpression.charAt(i);
				
				if(x=='('||x=='['||x=='{') {
					//push the element in the stack
					stack.push(x);
					continue;
				}
				//If current character is not opening then it might be empty
				if(stack.isEmpty())
				{
					return false;
				}
				char check;
				switch (x) {
				case ')':
					check=stack.pop();
					if(check=='{'||check=='[')
						return false;
					break;
				case '}':
					check=stack.pop();
					if(check=='('||check=='[')
						return false;
					break;
				case ']':
					check=stack.pop();
					if(check=='('||check=='{')
						return false;
					break;
				}
			}
			return(stack.isEmpty());
		}
			

}
