package com.kiran.project.euler.filters;

import java.util.List;

public class AndCriteria implements Criteria {

   private Criteria criteria;
   private Criteria otherCriteria;

   public AndCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<Integer> meetCriteria(List<Integer> list) {
   
      List<Integer> firstCriteriaPersons = criteria.meetCriteria(list);		
      return otherCriteria.meetCriteria(firstCriteriaPersons);
   }
}
