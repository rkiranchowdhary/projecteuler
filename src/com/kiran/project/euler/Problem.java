package com.kiran.project.euler;

import com.kiran.common.NotImplementedException;

public class Problem extends Thread{

	protected CommonHelper helper;
	public void run(){
		try {
			System.out.println("solution to "+this.getClass().getName()+" is :"+this.solve());
		} catch (NotImplementedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public long solve() throws NotImplementedException, InterruptedException{
		throw new NotImplementedException();
	}
}
