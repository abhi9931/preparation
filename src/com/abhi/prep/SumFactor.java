package com.abhi.prep;

public class SumFactor {
	
	
	public static int sumFactor(int[] ar) {
		int count=0;
		int sum=getSum(ar);
		
		for(int i=0;i<ar.length;i++) {
			if(sum==ar[i]) {
				count++;
			}
		}
		return count;
	}
	
	public static int getSum(int[] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		return sum;
	}
	

}
