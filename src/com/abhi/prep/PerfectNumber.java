package com.abhi.prep;

public class PerfectNumber {

	public static int henry(int i, int j) {
		int sum = 0;
		int count = 0;
		for (int num = 2;; num++) {
			if (num == getSum(getFactors(num))) {
				count++;
				if (count == i) {
					sum = sum + num;
				}
				if (count == j) {
					sum = sum + num;
					break;
				}
			}

		}

		return sum;
	}

	private static int[] getFactors(int num) {
		int[] ar = new int[num];
		for (int i = 1; i < num / 2 + 1; i++) {
			if (num % i == 0) {
				ar[i] = i;
			}
		}
		return ar;

	}

	private static int getSum(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;
	}
}
