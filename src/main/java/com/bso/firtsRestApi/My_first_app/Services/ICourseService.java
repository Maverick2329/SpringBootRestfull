package com.bso.firtsRestApi.My_first_app.Services;

import java.util.List;

import com.bso.firtsRestApi.My_first_app.Models.Course;

public interface ICourseService {
	Course saveCourse(Course course);
	Course getCourse(String name);
	List<Course> getAllCourse(int from, int limit);
	Course updateCourse(Course course);
	Course deleteCourse(Long id);
}
