package com.kiran.project.euler.problems;

import java.util.*;

import com.kiran.project.euler.CommonHelper;

public class Problem1 {

	
	
	CommonHelper commonHelper = new CommonHelper();
	public Integer solve(){
		List<Integer> list = commonHelper.getNaturalNumbers(999);
		List<Integer> divisible = new ArrayList<Integer>();
		for(Integer num : list){
			if(num % 5 ==0 || num % 3 ==0){
				divisible.add(new Integer(num));
			}
		}
		return commonHelper.getSumof(divisible);
	}
}
