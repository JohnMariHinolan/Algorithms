package com.jm.exercise.impl;

import com.jm.exercise.Exercise;
import com.jm.exercise.obj.ExerciseRes;

public class Exercise_Fibonacci implements Exercise {

	int result = 0;
	private int paramIn = 0;
	final int MAX = 100;
	final int NIL = -1;

	int lookup[] = new int[MAX];
	ExerciseRes resultEx = new ExerciseRes();

	public Exercise_Fibonacci() {
		_initialize();
	}

	void _initialize() {
		for (int i = 0; i < MAX; i++)
			lookup[i] = NIL;
	}

	@Override
	public String getTitle() {

		return "Fibonacci Algorithm";
	}

	@Override
	public String getDescription() {

		return "Returns the nth member of your algorithm For a Fibonacci (current limit of 46) e.g 0, 1, 1, 2, 3, 5, 8, 13, 21, 34";
	}

	@Override
	public void run() {

		long start = System.currentTimeMillis();
		System.out.println("start: " + start);
		resultEx.setResult(String.valueOf(fibTopDown(paramIn)));
		long end = System.currentTimeMillis();
		long timeTaken = end - start;

		System.out.println("end: " + end);
		System.out.println("timeTaken: " + timeTaken);

		resultEx.setAlgoTime(timeTaken);

	}

	@Override
	public void addPostParams() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addParams(String... param) {
		if (param.length > 0) {
			String parameter = param[0];
			try {
				paramIn = Integer.parseInt(parameter);
			} catch (ClassCastException e) {
				resultEx.setErrorMsg(e.getMessage());
				resultEx.setStatus("Failed");
			}

		} else {
			resultEx.setErrorMsg("No Parameter");
			resultEx.setStatus("Failed");
		}

	}

	@Override
	public ExerciseRes getResult() {

		return resultEx;
	}

	// Memoization
	private int fibMem(int n) {
		if (lookup[n] == NIL) {
			if (n <= 1)
				lookup[n] = n;
			else
				lookup[n] = fibMem(n - 1) + fibMem(n - 2);
		}
		return lookup[n];
	}

	// Topdown
	private int fibTopDown(int n) {
		int f[] = new int[n + 1];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= n; i++)
			f[i] = f[i - 1] + f[i - 2];

		System.out.println("f.length: " + f.length);
		return f[n];
	}

}
