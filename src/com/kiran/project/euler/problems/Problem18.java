package com.kiran.project.euler.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kiran.project.euler.CommonHelper;
import com.kiran.project.euler.Problem;

public class Problem18 extends Problem {
	
	int arr[][] ={
			{75,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
			{95,	64,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
			{17,	47,	82,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
			{18,	35,	87,	10,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
			{20,	04,	82,	47,	65,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
			{19,	01,	23,	75,	03,	34,	0,	0,	0,	0,	0,	0,	0,	0,	0},
			{88,	02,	77,	73,	07,	63,	67,	0,	0,	0,	0,	0,	0,	0,	0},
			{99,	65,	04,	28,	06,	16,	70,	92,	0,	0,	0,	0,	0,	0,	0},
			{41,	41,	26,	56,	83,	40,	80,	70,	33,	0,	0,	0,	0,	0,	0},
			{41,	48,	72,	33,	47,	32,	37,	16,	94,	29,	0,	0,	0,	0,	0},
			{53,	71,	44,	65,	25,	43,	91,	52,	97,	51,	14,	0,	0,	0,	0},
			{70,	11,	33,	28,	77,	73,	17,	78,	39,	68,	17,	57,	0,	0,	0},
			{91,	71,	52,	38,	17,	14,	91,	43,	58,	50,	27,	29,	48,	0,	0},
			{63,	66,	04,	68,	89,	53,	67,	30,	73,	16,	69,	87,	40,	31,	0},
			{04,	62,	98,	27,	23,	9,	70,	98,	73,	93,	38,	53,	60,	04,	23}
	};
	
	public Integer[] stack = new Integer[15];
	public int top = -1;
	public static long result = 0;
	
	public long solve() throws InterruptedException{
		
		
		for(int i=2; i<16;i++){
			
		}
		push(75);
		 findSum(0,0);
		 return result;
		
	}

	public void findSum(int row, int index) throws InterruptedException{
		if(row == 14){
			long sum = CommonHelper.getSumof(Arrays.asList(stack) );
			if(sum > result){
				System.out.println("\n\n\nSUM ::"+sum+"\n\n\n");
				result = sum;
			}
			
			return;
		}
		System.out.println("GOT::"+arr[row+1][index]);
		push(arr[row+1][index]);
		
		findSum(row+1, index);
		
		System.out.println("removed::"+pop());

		System.out.println("GOT::"+arr[row+1][index+1]);
		push(arr[row+1][index+1]);
		
		findSum(row+1, index+1);
		System.out.println("removed::"+pop());
		//return result;
		
	}
	
	
	public long findLeftIndex(int curr){
		return curr;
	}
	
	public long findRightIndex(int curr){
		return curr+1;
	}
	
	public void push(Integer num){
		//System.out.println("TOP: "+(top+1));

		stack[++top] = num;
	}
	public Integer pop(){
		//System.out.println("TOP: "+(top-1));
		int num = stack[top--]; 
		
		return num;
	}
}
