package com.kiran.project.euler;

import java.util.ArrayList;
import java.util.List;

public class CommonHelper {
	
	public static boolean isPalindrome(Integer number){
		String strNumber = String.valueOf(number);
		String reverseNumber = reverse(strNumber);
		return strNumber.equals(reverseNumber);
	}
	
	public static String reverse(String str){
		return new StringBuilder(str).reverse().toString();
	}
	
	public static boolean isEven(Integer number){
		return number % 2 == 0;
	}
	
	public static boolean isOdd(Integer number){
		return number % 2 != 0;
	}

	public static boolean isDivisible(Integer number, Integer devisor){
		return number % devisor == 0;
	}
	
	public static List<Integer> getNaturalNumbers(Integer count){
		
		List<Integer> list = new ArrayList<Integer>(); 
		for(int i=1; i <= count ; i++){
			list.add(new Integer(i));
		}
		return list;
	}
	
	public static List<Integer> getNFibiNocciNumbers(Integer count){
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
	
	public static List<Integer> getFibiNocciNumbersBelow(Integer number){
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
	
	public static List<Integer> getSquaredList(List<Integer> list){
		List<Integer> squaredList = new ArrayList<Integer>();
		for(Integer num : list){
			squaredList.add(new Integer(num*num));
		}
		return squaredList;
	}
	
	public static long getSumof(List<? extends Number> list){
		long sum = 0;
		for(Number  num : list){
			sum = sum+num.longValue();
		}
		return sum;
	}
	
	public static List<Long> getFactors(long num){
		
		List<Long> list = new ArrayList<Long>();
		long startPoint = (long)num/2;
		for(long i = startPoint; i > 1 ; i--){
			if( num % i == 0){
				list.add(new Long(i));
			}
		}
		return list;
	}
	
    public static List<Long> getFactors(long num, int count){
		
		List<Long> list = new ArrayList<Long>();
		if(count == 0) return list;
		long startPoint = (long)num/2;
		System.out.println("Start point : "+startPoint);
		for(long i = startPoint; i > 1 ; i--){
			System.out.println("i : "+i);
			if( num % i == 0){
				list.add(new Long(i));
				if(list.size() == count) return list;
			}
			
		}
		return list;
	}
	
	public static Long getBiggestPrimeFactor(long num){
		
		long startPoint = (long)num/2;
		for(long i = startPoint; i > 1 ; i--){
			if( num % i == 0 && isPrime(i)){
				return (Long)i;
			}
		}
		return new Long(-1L);
	}

	public static boolean isPrime(long num){
		long startPoint = (long)num/2;
		for(long i = startPoint; i > 1 ; i--){
			if( num % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static List<Integer> getListOfPrimeNumbersBelow(Long number){
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=2; i< number; i++){
			if(isPrime(i)){
				list.add(i);
			}
		}
		return list;
	}
	
	public static List<Long> getFactorsWithOne(long num){
		List<Long> list = getFactors(num);
		list.add(new Long(1));
		return list;
	}
	
}
