package com.kiran.project.euler.filters;

import java.util.List;

public class OrCriteria implements Criteria {

   private Criteria criteria;
   private Criteria otherCriteria;

   public OrCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<Integer> meetCriteria(List<Integer> list) {
      List<Integer> firstCriteriaItems = criteria.meetCriteria(list);
      List<Integer> otherCriteriaItems = otherCriteria.meetCriteria(list);

      for (Integer num : otherCriteriaItems) {
         if(!firstCriteriaItems.contains(num)){
            firstCriteriaItems.add(num);
         }
      }	
      return firstCriteriaItems;
   }
}
