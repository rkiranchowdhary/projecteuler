package com.kiran.project.euler.problems;

import java.util.*;

import com.kiran.project.euler.Problem;


public class Problem9 extends Problem{

	public long solve(){
		
		for(int i=0; i< 1000;i++){
			
			for(int j=i; j<1000;j++){
				
				for(int k=j; k<1000;k++){
					if(i+j+k == 1000)
					{
						List<Integer> list= new ArrayList<Integer>();
						list.add(i);
						list.add(j);
						list.add(k);
						int max = Collections.max(list);
						if( max*max == i*i+j*j+k*k-max*max ){
							if(i<j && j<k){
								System.out.println("Solved: "+i+","+j+","+k+" abc:"+i*j*k);
								return i*j*k;
							}
							
						}
					}
					
				}
			}
		}
		
		
		
		return -1l;
	}
}
