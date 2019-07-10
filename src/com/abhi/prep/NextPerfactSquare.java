package com.abhi.prep;

public class NextPerfactSquare {
public static final int NOT_PERFECT_SQUARE=-1;
	public static int nextPerfactSquare(int number) {
		// If a number is perfect square then calculate the sqrt increase by one and
		// then squaring it
		int sqrt = squareRoot(number);
		int nextPerfactSquare = 0;
		if (sqrt != NOT_PERFECT_SQUARE) {
			nextPerfactSquare = Math.multiplyExact(sqrt + 1, sqrt + 1);
		}
		// If a number is not perfect square then incrementing the number by one and
		// checking if it is a perfect square
		else {
			for (int i = number;; i++) {
				sqrt = squareRoot(i);
				if (sqrt != NOT_PERFECT_SQUARE) {
					nextPerfactSquare = i;
					break;
				}
			}
		}
		return nextPerfactSquare;
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
