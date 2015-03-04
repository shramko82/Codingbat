package ua.shramko.main2;

/*
 * We want to make a row of bricks that is goal inches long. We have a number of
 * small bricks (1 inch each) and big bricks (5 inches each). Return true if it
 * is possible to make the goal by choosing from the given bricks. This is a
 * little harder than it looks and can be done without any loops.
 * 
 * makeBricks(3, 1, 8) → true makeBricks(3, 1, 9) → false makeBricks(3, 2, 10) →
 * true
 */

public class MakeBricks {
	public boolean makeBricks(int small, int big, int goal) {
		if (goal == 0) {
			return true;
		}
		int currentLine = 0;
		if (big >= 0) {
			for (int i = 1; i <= big; i++) {
				currentLine += 5;
				if (currentLine == goal)
					return true;
				else if (currentLine > goal) {
					currentLine -= 5;
					break;
				}
			}
		}
		if (small >= 0) {
			for (int i = 1; i <= small; i++) {
				currentLine++;
				if (currentLine == goal)
					return true;
			}
		}
		return false;
	}
}
