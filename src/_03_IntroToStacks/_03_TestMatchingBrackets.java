package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<Character> brackets = new Stack<Character>();
		for (int i = 0; i < b.length(); i++) {
			Character BracketChar = b.charAt(i);
			if (BracketChar == '{') {
				brackets.push(BracketChar);
			}
			if (BracketChar == '}') {
				if (brackets.isEmpty() != true) {
					brackets.pop();
				} else {
					return false;
				}
			}
		}
		if (brackets.isEmpty()) {
			return true;
		}
		return false;
	}
}