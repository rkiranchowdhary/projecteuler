package com.kiran.project.euler.problems;

import com.kiran.project.euler.CommonHelper;
import com.kiran.project.euler.Problem;

public class Problem12 extends Problem{
	

	public long solve(){
		int startNumber = 499500;
		int startIndex = 1001;
		for(int i = startIndex; ;i++){
			startNumber = startNumber+i;
			if(CommonHelper.getFactors(startNumber).size() >= 500){
				return (long)startNumber;
			}
		}
		
	}

}
