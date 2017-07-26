package com.kiran.common;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import com.kiran.project.euler.*;

public class Main {

	public static void main(String[] args) {
		try {
//			Integer[] problemIds = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
//					16, 18, 19, 20, 21 };
			Integer[] problemIds = { 26};
			List<Problem> problems = ProblemCreator
					.createProblemsUsingIds(Arrays.asList(problemIds));

			// Problem problem = ProblemCreator.createProblemUsingId(1l);
			ProblemSolver.solveAll(problems);
			
			//Reflections reflections = new Reflections("org.home.junk");
			//Reflection reflection = new Reflection();
			//Set<Class<? extends Problem>> annotated = reflection.getTypesAnnotatedWith(com.kiran.common.Solvable.class);

			new Thread().start();
			new Thread().run();
			new Thread(new Runnable(){
				public void run(){
                   main(args);
				}
			}).start();
			new Thread( () -> main(args));

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}