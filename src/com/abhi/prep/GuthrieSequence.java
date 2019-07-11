package com.abhi.prep;

public class GuthrieSequence {
	
	public static int isGuthrieSequence(int[] ar) {
		int temp=0;
	
		if(ar[ar.length-1]!=1) {
			return 0;
		}
		for(int i=1;i<ar.length-1;i++) {
			
			if(ar[i]%2==0 && ar[i+1]!=ar[i]/2) {
				
				
					return 0;
				
			}else if(ar[i]%2!=0 &&ar[i+1]!=ar[i]*3+1) {
			return 0;		
			}
			
		}
		
		return 1;
	}

}
