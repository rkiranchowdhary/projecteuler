package com.kiran.common;

import java.lang.reflect.InvocationTargetException;

import com.kiran.project.euler.Problem;


public class ProblemCreator {
	private static String PROBLEM = "Problem";

	public static  Problem createProblemUsingId(long id) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		String className = PROBLEM+String.valueOf(id);
		Class<?> cl = Class.forName(className);
		return (Problem)cl.getConstructor().newInstance();
	}
}
