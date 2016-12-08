package com.kiran.project.euler.problems;

import com.kiran.project.euler.CommonHelper;
import com.kiran.project.euler.Problem;

public class Problem10  extends Problem{

	public long solve(){
	  long solution = CommonHelper.getSumof(CommonHelper.getListOfPrimeNumbersBelow(2000000L));
	  return solution;
	}
}
