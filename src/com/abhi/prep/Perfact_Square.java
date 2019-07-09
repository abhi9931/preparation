package com.abhi.prep;

public class Perfact_Square {

	
	public static int isSquare(int n) {
		
		
		for(int i=1;i*i<=n;i++) {
			if(i*i==n) {
				return 1;
			}
		}
		
		return 0;
	}
}
