package com.kiran.project.euler;

import java.util.ArrayList;
import java.util.List;

public class CommonHelper {
	
	public boolean isPalindrome(Integer number){
		String strNumber = String.valueOf(number);
		String reverseNumber = reverse(strNumber);
		return strNumber.equals(reverseNumber);
	}
	
	public String reverse(String str){
		return new StringBuilder(str).reverse().toString();
	}
	
	public boolean isEven(Integer number){
		return number % 2 == 0;
	}
	
	public boolean isOdd(Integer number){
		return number % 2 != 0;
	}

	public boolean isDivisible(Integer number, Integer devisor){
		return number % devisor == 0;
	}
	
	public List<Integer> getNaturalNumbers(Integer count){
		
		List<Integer> list = new ArrayList<Integer>(); 
		for(int i=1; i <= count ; i++){
			list.add(new Integer(i));
		}
		return list;
	}
	
	public List<Integer> getNFibiNocciNumbers(Integer count){
		List<Integer> list = new ArrayList<Integer>();
		if(count == 0 ) return list;
		if(count == 1){
			list.add(new Integer(0));
			return list;
		}
		if(count == 2){
			list.add(new Integer(0));
			list.add(new Integer(1));
			return list;
		}
		list.add(new Integer(0));
		list.add(new Integer(1));
		
		int n1=0,n2=1,n3,i;      
		 for(i=3;i<=count;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  list.add(new Integer(n3));   
		  n1=n2;    
		  n2=n3;    
		 }   
		 return list;
	}
	
	public List<Integer> getFibiNocciNumbersBelow(Integer number){
		List<Integer> list = new ArrayList<Integer>();
		if(number == 0 ) return list;
		if(number == 1){
			list.add(new Integer(0));
			return list;
		}
		if(number == 2){
			list.add(new Integer(0));
			list.add(new Integer(1));
			return list;
		}
		
		list.add(new Integer(0));
		list.add(new Integer(1));
		
		int n1=0,n2=1,n3;     
		while((n1+n2) < number)   
		 {    
		  n3=n1+n2;    
		  list.add(new Integer(n3));   
		  n1=n2;    
		  n2=n3;    
		 }   
		 return list;
	}
}
