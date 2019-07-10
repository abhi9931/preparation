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
		boolean isPrime = false;
		for (int i = 0;; i++) {
			num = num + 10;
			isPrime = checkPrimeNumber(num);
			if (isPrime)
				break;
		}
		return num;
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
