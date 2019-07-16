package com.abhi.prep;

public class RespEqual {

	public static int repsEqualRaw(int[] ar, int num) {

		for (int i = ar.length - 1; i >= 0; i--) {
			if (ar[i] != num % 10) {
				return 0;
			} else {
				num = num / 10;
			}
		}

		return 1;
	}

	// Solving same problem using String class
	/*public static int repsEqual(int[] ar, int num) {
		String strNum = String.valueOf(num);
		int length = strNum.length();
		if (ar.length != length) {
			return 0;
		}
		for (int i = 0; i < length; i++) {
			if (!String.valueOf(ar[i]).equals(strNum.charAt(i)+"")) {
				return 0;
			}
		}
		return 1;
	}*/

}
