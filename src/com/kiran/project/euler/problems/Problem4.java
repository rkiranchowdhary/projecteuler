package com.kiran.project.euler.problems;

import java.util.*;

import com.kiran.common.NoSolutionException;
import com.kiran.project.euler.CommonHelper;
import com.kiran.project.euler.Problem;

public class Problem4 extends Problem{
	public long solve(){
		List<Long> list = new ArrayList<Long>();
		for(int i = 999 ; i > 900 ; i--){
			for(int j = 999 ; j > 900 ; j--){
				if(CommonHelper.isPalindrome( i*j)){
					list.add(new Long(i*j));
				}
			}
		}
		if(list.size() == 0){
			throw new NoSolutionException();
		}
		
		return Collections.max(list);
	}
}
