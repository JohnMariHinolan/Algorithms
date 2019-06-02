package com.jm.exercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jm.exercise.Exercise;
import com.jm.exercise.obj.ExerciseRes;
import com.jm.exercise.util.ExerciseFactory;

@RestController
public class ExerciseController {

	@GetMapping("/exercise/{key}/{param}")
	public ExerciseRes getExerciseResut(@PathVariable("key") String key, @PathVariable("param") String param) {

		Exercise exercise = ExerciseFactory.getExercise(key);

		exercise.addParams(param);
		exercise.run();

		return exercise.getResult();

	}

	@GetMapping("/exercise/{key}/info")
	public String getExerciseInfo(@PathVariable("key") String key) {

		Exercise exercise = ExerciseFactory.getExercise(key);

		return exercise.getDescription();

	}

	@GetMapping("/exercise/{key}/title")
	public String getExerciseTitle(@PathVariable("key") String key) {

		Exercise exercise = ExerciseFactory.getExercise(key);

		return exercise.getTitle();

	}

}
