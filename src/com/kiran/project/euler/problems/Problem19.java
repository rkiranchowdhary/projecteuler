package com.kiran.project.euler.problems;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.kiran.project.euler.Problem;

public class Problem19 extends Problem {

	public long solve(){
		Calendar startDate = Calendar.getInstance();
		startDate.set(1901, 0, 1);

		int count =0;
		while(true){
			
			if(startDate.getTimeInMillis() > new Date(100,11,31).getTime()){
				break;
			}
			if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
		        count ++;
		    }
			startDate.add(Calendar.MONTH, 1);
		}
		
		return count;
	}
}
