package com.abhi.prep;

public class Centered_15 {
	static int count=0;
	public static int isCentered15(int[] a) {
		
		for(int count=0;count<a.length;count++) {
			int sum=0;
			for(int i=count;i<a.length-count;i++) {
				sum=sum+a[i];
				
			}
			if(sum==15) {
				return 1;
			}
			
		}
		return 0;
		
	/*	
	
	int[] ar=new int[a.length];
		for(int i=count;i<a.length-count;i++) {
			ar[i]=a[i];
		}
		if(getSum(ar)==15) {
			return 1;
		}else {
			count++;
			
		}
		
		
		int sum=0;
		while(sum==15) {
			
		}
		
		return 0;*/
	}
	
	public static int getSum(int[] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		return sum;
	}
}
