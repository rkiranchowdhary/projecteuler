package com.kiran.common;

import java.util.List;

import com.kiran.project.euler.Problem;

public class ProblemSolver {

	public static void solve(Problem problem){
		problem.start();
	}
	public static void solveAll(List<Problem> problems){
		for(Problem problem:problems){
			solve(problem);
		}
	}
}
