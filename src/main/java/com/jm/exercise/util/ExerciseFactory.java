package com.jm.exercise.util;

import com.jm.exercise.Exercise;
import com.jm.exercise.impl.Exercise_Fibonacci;

public class ExerciseFactory {

	private ExerciseFactory() {
	}

	public static Exercise getExercise(String key) {

		if ("fibonacci".equals(key)) {
			return new Exercise_Fibonacci();
		}

		return null;
	}

}
