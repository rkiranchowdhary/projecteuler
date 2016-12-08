package com.kiran.project.euler.problems;

import com.kiran.common.NoSolutionException;
import com.kiran.project.euler.*;

public class Problem3 extends Problem{
	public long solve() throws NoSolutionException{
		return CommonHelper.getBiggestPrimeFactor(600851475143L);
	}
}
