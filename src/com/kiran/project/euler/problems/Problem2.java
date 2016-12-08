package com.kiran.project.euler.problems;

import java.util.List;

import com.kiran.common.NoSolutionException;
import com.kiran.project.euler.CommonHelper;
import com.kiran.project.euler.Problem;

public class Problem2  extends Problem{
	public long solve() throws NoSolutionException{
		List<Integer> list = CommonHelper.getFibiNocciNumbersBelow(4_000_000);
		long sum  =0;
		for(Integer num : list){
			sum += ( CommonHelper.isEven(num))? num : 0;
		}
		return sum;
	}
}
