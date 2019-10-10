package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;
import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> stack = new Stack<Double>();
		Double d;
		Random y = new Random();
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			d = y.nextDouble() * 100;
			stack.push(d);
		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String u1 = JOptionPane.showInputDialog("Enter a number between 0 and 100");
		String u2 = JOptionPane.showInputDialog("Enter another different number between 0 and 100");
		double num1 = Double.parseDouble(u1);
		double num2 = Double.parseDouble(u2);
		if (num1 > num2) {
			double t = num1;
			num1 = num2;
			num2 = t;
		}
		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.
		System.out.println("Popping elements off stack..." + "\n" + "Elements between " + num1 + " and " + num2 + ":");
		for (int i = 0; i < stack.size(); i++) {
			if ((stack.get(i) >= num1) && (stack.get(i) <= num2)) {
				System.out.println(stack.get(i));
			} else {
				stack.pop();
			}
		}
		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
