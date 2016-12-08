package com.kiran.project.euler.problems;

import com.kiran.common.NoSolutionException;
import com.kiran.project.euler.Problem;

public class Problem5 extends Problem{

	public long solve() throws NoSolutionException{
		long i =20;;
		while (true)
		{
			if ((i%11)==0 && (i%12)==0&&(i%13)==0 && (i%14)==0 && (i%15)==0 && (i%16)==0 && (i%17)==0 && (i%18)==0 && (i%19)==0 && (i%20)==0) break;
			else{
				i++;
			} 
		}
		return (Long)i;
	}
}
