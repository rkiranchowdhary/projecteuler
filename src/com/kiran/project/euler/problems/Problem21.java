package com.kiran.project.euler.problems;

import java.util.*;

import com.kiran.common.Solvable;
import com.kiran.project.euler.CommonHelper;
import com.kiran.project.euler.Problem;

@Solvable
public class Problem21 extends Problem {

	public long solve(){
		
		Set<Long> list = new HashSet<Long>();
		for(int i=2; i<10000;i++){
			long sum = CommonHelper.getSumof(CommonHelper.getFactorsWithOne(i));
			long temp = CommonHelper.getSumof(CommonHelper.getFactorsWithOne(sum));
			if(i == temp){
				System.out.println("pair : "+i+","+sum);
				
					list.add(sum);
					list.add(temp);
			}
		}
		List<Long> set = new ArrayList<Long>(list);
		return CommonHelper.getSumof(set);
	}
}
