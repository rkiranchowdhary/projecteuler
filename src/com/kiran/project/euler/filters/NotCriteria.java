package com.kiran.project.euler.filters;

import java.util.ArrayList;
import java.util.List;

public class NotCriteria implements Criteria {

	   private Criteria criteria;

	   public NotCriteria(Criteria criteria) {
	      this.criteria = criteria;
	   }

	   @Override
	   public List<Integer> meetCriteria(List<Integer> list) {
	      
		  List<Integer> firstCriteriaItems = criteria.meetCriteria(list);
		  List<Integer> notCriteria = new ArrayList<Integer>(list);
	      for (Integer num : list) {
	         if(!firstCriteriaItems.contains(num)){
	        	 notCriteria.add(num);
	         }
	      }	
	      return notCriteria;
	   }
	}