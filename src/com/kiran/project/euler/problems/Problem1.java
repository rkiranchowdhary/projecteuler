package com.kiran.project.euler.problems;

import java.util.*;

import com.kiran.common.NoSolutionException;
import com.kiran.project.euler.CommonHelper;
import com.kiran.project.euler.Problem;

public class Problem1 extends Problem{ 
	
	@Override
	public  long solve() throws NoSolutionException{
		List<Integer> list = CommonHelper.getNaturalNumbers(999);
		List<Integer> divisible = new ArrayList<Integer>();
		for(Integer num : list){
			if(num % 5 ==0 || num % 3 ==0){
				divisible.add(new Integer(num));
			}
		}
		return CommonHelper.getSumof(divisible);
	}
}
