package com.abhi.prep;

public class MadhavArray {

	public static  int isMadhavArray(int[] ar) {
		int length=ar.length;
		int counter=2;
		int retVal=1;
		for(int i=0;i<length;i++) {
			if(counter<length) {
				int sum=0;
				for(int j=i+counter-1;j<=counter;j++) {
					if(j+counter<length-1)
				 sum=sum+ar[j];
				 
				}
				if(sum!=ar[0]) {
					retVal=0;
					break;
				}
			}
			counter++;
		}
		
		
		
		
		
		
		return retVal;
	}
}
