package com.abhi.prep.main;

import com.abhi.prep.InertialArray;
import com.abhi.prep.MadhavArray;
import com.abhi.prep.N_Unique;
import com.abhi.prep.NextPerfactSquare;
import com.abhi.prep.Perfact_Square;
import com.abhi.prep.PrimeNumber;

public class DriverClass {
	public static void main(String[] args) {
		int[] input = {7, 3, 3, 2, 4};
	//	System.out.println("Is Inertial Array\t" + InertialArray.isInertial(input));
		//System.out.println("\nIs Madhav Array\t" + MadhavArray.isMadhavArray(input));
		//System.out.println(PrimeNumber.primeCount(1, 1));
		//System.out.println(NUnique.isNUnique(input, 6));
		
		//System.out.println(Perfact_Square.isSquare(36));
		
		System.out.println(NextPerfactSquare.nextPerfactSquare(-5));
	}

}
