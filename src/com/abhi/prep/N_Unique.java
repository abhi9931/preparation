package com.abhi.prep;

public class NUnique {
	
	public static int isNUnique(int[] ar,int n) {
		int count=0;
		int length=ar.length;
		if(length<2) {
			return 0;
		}
		for(int i=0;i<length;i++) {
			for(int j=i;j<length;j++) {
				int sum=0;
				if(i!=j) {
				sum=ar[i]+ar[j];
				}
				if(sum==n) {
					count++;
				}
			}
		}
	
		if(count==1) {
			return 1;
		}
		return 0;
	}

}
