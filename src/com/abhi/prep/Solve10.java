package com.abhi.prep;

public class Solve10 {

	public static int[] solve10() {

		int[] ar = new int[2];

		// Summing up factorial of all possible combination of x (0 to 10) and y(10 to
		// 0)
		for (int x = 0; x < 10; x++) {

			for (int y = 10; y > 0; y--) {
				int xFact = findfactorial(x);
				int yFact = findfactorial(y);
				if (xFact + yFact == findfactorial(10)) {
					ar[0] = x;
					ar[1] = y;
					break;
				}
			}

		}

		return ar;
	}

	public static int findfactorial(int num) {
		int fact = 1;
		if (num < 1) {
			return 1;
		}
		for (int i = num; i > 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

}
