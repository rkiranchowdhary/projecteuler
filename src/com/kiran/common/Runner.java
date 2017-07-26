package com.kiran.common;

import java.util.Arrays;

import com.kiran.project.euler.CommonHelper;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean arr[] = new boolean[100];
		CharSequence cs= args[0].subSequence(0, 99);
		cs.chars();
		for(int i=1;i<=100;i++)
		{
			arr=operate(arr,i);
		}
		int count=0;
		for(int i=1;i<=100;i++){
			if(arr[i-1])
			count++;
		}
		
		System.out.println("Count::"+count);
		
		
	}
	
	public static boolean[] operate(boolean[] arr, int num){
		
		for(int i=num-1; i<arr.length;i+=num){
			arr[i] =!arr[i];
		}
		return arr;
	}

}
