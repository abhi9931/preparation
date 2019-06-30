package com.abhi.prep;

public class MadhavArray {

	public static int isMadhavArray(int[] ar) {
		int counter = 2;
		int firstPossition = 1;
		int length = ar.length;

		int lastPossition = 0;
		int checkVal = 0;
		// Checking if length is n*(n+1)/2
		for (int i = 1; i < length; i++) {
			checkVal = Math.multiplyExact(i, i + 1) / 2;
			if (checkVal == length) {
				break;
			}
		}

		if (checkVal != length) {
			return 0;
		}

		for (int i = 0; i < length; i++) {
			int sum = 0;
			lastPossition = firstPossition + counter;
			for (int j = firstPossition; j < lastPossition; j++) {
				if (j > length - 1) {
					return 1;
				}
				sum = sum + ar[j];

			}
			if (ar[0] != sum) {
				return 0;
			}
			firstPossition = firstPossition + counter;
			counter++;
		}
		return 1;
	}

}
