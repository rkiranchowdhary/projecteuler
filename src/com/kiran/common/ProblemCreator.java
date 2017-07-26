package com.kiran.common;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import com.kiran.project.euler.Problem;


public class ProblemCreator {
	private static String PROBLEM = "com.kiran.project.euler.problems.Problem";

	public static  Problem createProblemUsingId(long id) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		String className = PROBLEM+String.valueOf(id);
		Class<?> cl = Class.forName(className);
		return (Problem)cl.getConstructor().newInstance();
	}
	public static List<Problem> createProblemsUsingIds(List<Integer> list) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		List<Problem> problems = new ArrayList<Problem>();
		for(Integer id : list){
			problems.add(createProblemUsingId( (long)id));
		}
		return problems;
	}
}
