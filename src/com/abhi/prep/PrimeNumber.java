package com.abhi.prep;

public class PrimeNumber {
public static int primeCount(int start, int end) {
	int count=0;
	for(int num=start;num<=end;num++) {
		if(checkPrimeNumber(num)==true) {
			count++;
		}
	}
	
	
	
	return count;
}

public static boolean checkPrimeNumber(int num) {
	int maxDividend=num/2+1;
	if(num<=1) {
		return false;
	}
	
	for(int i=2;i<maxDividend;i++) {
		if(num%i==0) {
			return false;
		}
	}
	
	return true;
}

}
