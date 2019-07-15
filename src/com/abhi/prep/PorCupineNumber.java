package com.abhi.prep;

public class PorCupineNumber {

	public static int findPorcupineNumber(int num) {

		if (num % 10 != 9) {
			for (int i = 0;; i++) {
				num = num + 1;
				if (num % 10 == 9) {
					break;
				}
			}

		}
		return findNextPrimeNumberThatEndsWith_9(num);

	}

	public static int findNextPrimeNumberThatEndsWith_9(int num) {
		int i = 0;
		for (i = num + 10;; i = i + 10) {

			if (checkPrimeNumber(i)) {
				if (findIfNextPrimeNumberAlsoEndsWith_9(i))
					break;
			}
		}
		return i;
	}

	public static boolean findIfNextPrimeNumberAlsoEndsWith_9(int num) {
		boolean nextPrime = false;
		for (int i = num + 1; i <= num + 10; i++) {
			if (checkPrimeNumber(i)) {
				if (i % 10 != 9) {
					nextPrime = false;
					break;
				} else if (i % 10 == 9) {
					nextPrime = true;
					break;
				}
			}
		}
		return nextPrime;
	}

	public static boolean checkPrimeNumber(int num) {
		int maxDivider = num / 2 + 1;
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < maxDivider; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
