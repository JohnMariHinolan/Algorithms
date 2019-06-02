package com.jm.exercise;

import com.jm.exercise.obj.ExerciseRes;

/**
 * 
 * An interface for training exercise
 **/
public interface Exercise {

	public String getTitle();

	public String getDescription();

	public void run();

	public ExerciseRes getResult();

	public void addPostParams();

	public void addParams(String... param);

}
