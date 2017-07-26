package com.kiran.project.euler.problems;

import java.math.BigDecimal;

import com.kiran.project.euler.CommonHelper;
import com.kiran.project.euler.Problem;

public class Problem26 extends Problem {

	public long solve(){
		
		BigDecimal num = null ;
		for(int i=2 ; i< 1000;i++){
			num = new BigDecimal(String.valueOf(i));
			System.out.println("val : "+BigDecimal.ONE.divide(num,80,5));
		}
		
		
		return -1l;
	}
}
