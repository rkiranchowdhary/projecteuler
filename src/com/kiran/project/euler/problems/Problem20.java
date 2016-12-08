package com.kiran.project.euler.problems;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.kiran.project.euler.CommonHelper;
import com.kiran.project.euler.Problem;

public class Problem20 extends Problem {

	public long solve(){
		
		BigDecimal l =  fact(new BigDecimal(100));
		return CommonHelper.getSumof( stringToIntList(l.toString()));
		
	}
	
	private BigDecimal fact(BigDecimal num){
		
		if(num.compareTo( BigDecimal.ONE) <= 0) return BigDecimal.ONE;
		
		BigDecimal res = num.multiply(fact(num.subtract(BigDecimal.ONE)));
		return res;
	}
	
	  private List<Integer> stringToIntList(String str){
		   List<Integer> result = new ArrayList<Integer>();
		   String[] digits = str.split("(?!^)");
		   for(String s : digits){
			   if(s=="")
				   continue;
			   else
			   result.add(Integer.parseInt(s));
		   }
		   return result;
		   
	   }
}
