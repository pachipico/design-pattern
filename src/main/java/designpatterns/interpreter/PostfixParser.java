package designpatterns.interpreter;

import java.util.Stack;

public class PostfixParser {

	public static PostfixExpression parse(String expression) {
		Stack<PostfixExpression> stack = new Stack<>();
		for (char c : expression.toCharArray()) {
			stack.push(getExpression(c, stack));
		}

		return stack.pop();
	}

	private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
		switch (c) {
		case '+':
			return new PlusExpression(stack.pop(), stack.pop());
		case '-':
			PostfixExpression minusRight = stack.pop();
			PostfixExpression minusLeft = stack.pop();
			return new MinusExpression(minusLeft, minusRight);
		case '*':
			PostfixExpression multiplyRight = stack.pop();
			PostfixExpression multiplyLeft = stack.pop();
			return new MultiplyExpression(multiplyLeft, multiplyRight);
			
		default:
			return new VariableExpression(c);
		}

	}
}
