package com.kiran.project.euler.problems;

import java.util.List;

import com.kiran.project.euler.CommonHelper;
import com.kiran.project.euler.Problem;

public class Problem6 extends Problem{

	public long solve(){
		List<Integer> natural = CommonHelper.getNaturalNumbers(100);
		List<Integer> list = CommonHelper.getSquaredList(natural);
		long sum = CommonHelper.getSumof(list);
		
		long naturalSum = CommonHelper.getSumof(natural);
		long sum2 = naturalSum * naturalSum;
		
		long diff = Math.abs(sum-sum2);
		
		return diff;
		
	}
}
