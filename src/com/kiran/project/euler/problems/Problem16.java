package com.kiran.project.euler.problems;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.kiran.project.euler.Problem;

public class Problem16 extends Problem {

	public long solve(){
		BigDecimal value = new BigDecimal(2);
		String str = String.valueOf(value.pow(1000));
		
		return findSumOfList(stringToIntList(str));
	}
	
	private List<Integer> stringToIntList(String str){
		System.out.println("str :"+str);
		   List<Integer> result = new ArrayList<Integer>();
		   String[] digits = str.split("(?!^)");
		  // System.out.println("digits :: "+digits[0]);
		   for(String s : digits){
			 //  System.out.println("s :"+s);
			   if(s=="" || s == ".")
				   continue;
			   
			   result.add(Integer.parseInt(s));
		   }
		   return result;
		   
	   }
	   
	   private long findSumOfList(List<Integer> list){
		   long prod =0;
		   for(Integer num :list){
			   prod = prod+num;
		   }
		   return prod;
	   }
}
