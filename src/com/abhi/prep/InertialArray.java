package com.abhi.prep;

public class InertialArray {

	public static int isInertial(int[] ar) {

		if (null != ar && 2 < ar.length) {
			ar = sortArray(ar);

		} else {
			return 0;
		}

		boolean lastIndexEven = false;
		boolean isInertial = true;
		int retVal = 1;
		int length = ar.length;
		// After sorting in ASC order checking is last index is an even number
		if (ar[length - 1] % 2 == 0) {
			lastIndexEven = true;
		} else {
			retVal = 0;
		}
		if (lastIndexEven) {
			for (int i = 0; i < length - 1; i++) {
				// Checking if the array contains at least one odd number
				if (ar[i] % 2 != 0) {
					int oddNumber = ar[i];
					// Checking if all the odd numbers are greater than all the even number except
					// the biggest even number
					for (int j = 0; j < length - 1; j++) {
						// Checking if all the even numbers except the maximum number (occuring any
						// number of times) are not bigger than odd number
						if (ar[j] % 2 == 0 && ar[j] != ar[length - 1]) {
							if (oddNumber < ar[j]) {
								isInertial = false;
								retVal = 0;
								break;
							}
						}
					}

				}
			}
		}
		// System.out.println("Is inertial : " + isInertial);
		return retVal;
	}

	public static int[] sortArray(int[] ar) {
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i; j > 0; j--) {
				if (ar[j] < ar[j - 1]) {
					temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
				}
			}
		}
		return ar;
	}

}
