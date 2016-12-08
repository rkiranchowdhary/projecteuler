package com.kiran.project.euler.problems;

import com.kiran.project.euler.CommonHelper;
import com.kiran.project.euler.Problem;

public class Problem7 extends Problem{

	public long solve(){
		int count = 0;
		int i = 2;
		while(true){
			if(CommonHelper.isPrime(i)){
				count ++;
				//System.out.println(count +" : "+i);
				if(count == 10001){
					return i;
				}
			}
			i++;
		}
	}
}
