package com.abhi.prep;

public class SquarePair {
	public static final int NOT_PERFECT_SQUARE = -1;

	public static int countSquarePairs(int[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {

				if (i != j && ar[i] > 0 && ar[j] > 0 && ar[i] < ar[j]
						&& squareRoot(ar[i] + ar[j]) != NOT_PERFECT_SQUARE) {
					count++;
				}
			}
		}
		return count;
	}

	public static int squareRoot(int n) {

		if (n >= 0)
			for (int i = 0; i * i <= n; i++) {
				if (i * i == n) {
					return i;
				}
			}

		return NOT_PERFECT_SQUARE;
	}

}
